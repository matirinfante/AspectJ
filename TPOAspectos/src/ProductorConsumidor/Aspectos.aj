package ProductorConsumidor;

import java.util.concurrent.locks.*;

public aspect Aspectos {

	Lock cerrojo = new ReentrantLock();
	Condition noVacio = cerrojo.newCondition();
	Condition noLleno = cerrojo.newCondition();

// -----------------------------------------------------------------------------------------------------------------------

	pointcut agregar(Buffer buffer) :execution (void Buffer.poner(String)) && target(buffer);

	before(Buffer buffer): agregar(buffer) {
		cerrojo.lock();
		try {
			while (buffer.estaLleno()) {
				noLleno.await();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	after(Buffer buffer): agregar(buffer){
		noVacio.signal();
		cerrojo.unlock();
	}

// --------------------------------------------------------------------------------------------------------------------------------

	pointcut sacar(Buffer buffer) : execution (void Buffer.sacar(String)) && target(buffer);

	before(Buffer buffer): sacar(buffer){
		cerrojo.lock();
		try {
			while (buffer.estaVacio()) {
				noVacio.await();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	after(Buffer buffer): sacar(buffer){
		noLleno.signal();
		cerrojo.unlock();
	}

}

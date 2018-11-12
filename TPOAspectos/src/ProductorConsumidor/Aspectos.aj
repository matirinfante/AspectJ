package ProductorConsumidor;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.*;

public aspect Aspectos {

	Lock cerrojo = new ReentrantLock();
	Condition estaVacio = cerrojo.newCondition();
	Condition estaLleno = cerrojo.newCondition();

	Semaphore lleno = new Semaphore(0);
	Semaphore vacio = new Semaphore(5);
	Semaphore mutex = new Semaphore(1);

	pointcut agregar(Buffer buffer) :execution (void Buffer.poner(String)) && target(buffer);

	before(Buffer buffer): agregar(buffer) {
		// cerrojo.lock();
		try {
			vacio.acquire();
			mutex.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	after(Buffer buffer): agregar(buffer){
		// cerrojo.unlock();
		System.out.println("Hay " + vacio.availablePermits() + " espacios disponibles");
		mutex.release();
		lleno.release();
	}

	pointcut sacar() : execution (void Buffer.sacar(String));

	before(): sacar(){
		// cerrojo.lock();
		try {
			lleno.acquire();
			mutex.acquire();
			System.out.println("Hay " + vacio.availablePermits() + " espacios disponibles");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	after(): sacar(){
		// cerrojo.lock();
		mutex.release();
		vacio.release();
	}

}

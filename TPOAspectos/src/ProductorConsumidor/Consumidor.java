package ProductorConsumidor;

public class Consumidor extends Thread {

	private Buffer buffer;
	private String nombre;

	public Consumidor(String name, Buffer bf) {
		this.nombre = name;
		this.buffer = bf;

	}

	public void run() {
		while (true) {
			buffer.sacar(nombre);
			try {
				sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
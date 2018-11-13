package ProductorConsumidor;

public class Productor extends Thread {

	private Buffer buffer;
	private String nombre;

	public Productor(String name, Buffer bf) {
		this.nombre = name;
		this.buffer = bf;
	}

	public void run() {
		while (true) {
			buffer.poner(nombre);
			try {
				sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
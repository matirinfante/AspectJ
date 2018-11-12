package ProductorConsumidor;

public class Buffer {
	// private int[] arreglo = new int[10];
	//private int puntero = 0;

	public void poner(String name) {
		// arreglo[puntero] = 1;
		// puntero++;
		System.out.println("Productor " + name + " : agrego a la canasta");

	}

	public void sacar(String name) {
		// arreglo[puntero] = 0;
		// puntero--;
		System.out.println("Consumidor " + name + " saco de la canasta");
	}
}
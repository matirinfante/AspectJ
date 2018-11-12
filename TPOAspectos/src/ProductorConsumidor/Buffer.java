package ProductorConsumidor;

public class Buffer {
	private int[] arreglo;
	private int puntero;
	private int TAMAÑO;

	public Buffer(int tam) {
		TAMAÑO = tam;
		arreglo = new int[TAMAÑO];
		puntero = 0;
	}

	public void poner(String name) {
		arreglo[puntero] = 1;
		puntero++;
		System.out.println(">>>>>>" + name + " : agrego a la canasta | Hay " + puntero + " items");

	}

	public void sacar(String name) {
		puntero--;
		arreglo[puntero] = 0;
		System.out.println("<<<<<<" + name + " saco de la canasta | Hay " + puntero + " items");
	}

	public boolean estaLleno() {
		return puntero == TAMAÑO;
	}

	public boolean estaVacio() {
		return puntero == 0;
	}

}
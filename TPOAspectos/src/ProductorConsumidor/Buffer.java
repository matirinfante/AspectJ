package ProductorConsumidor;

public class Buffer {
	private int[] arreglo;
	private int puntero;
	private int TAMA�O;

	public Buffer(int tam) {
		TAMA�O = tam;
		arreglo = new int[TAMA�O];
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
		return puntero == TAMA�O;
	}

	public boolean estaVacio() {
		return puntero == 0;
	}

}
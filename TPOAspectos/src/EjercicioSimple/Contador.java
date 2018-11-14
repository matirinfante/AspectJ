package EjercicioSimple;

public class Contador {

	static int contador;

	public static void main(String[] args) {
		contador = 0;
		int i = 0;
		while (i < 100) {
			sumar();
			mostrarContador();
		}
	}

	public static void mostrarContador() {
		System.out.println("Contador: " + contador);
	}

	public static void sumar() {
		contador++;
		System.out.println("Se ha sumado 1.");
	}

}

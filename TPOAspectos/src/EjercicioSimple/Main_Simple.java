package EjercicioSimple;

public class Main_Simple {

	public static void main(String[] args) {
		Persona p1 = new Persona("Alfa", "0001", 30);
		Persona p2 = new Persona("Beta", "0002", 40);
		Persona p3 = new Persona("Gama", "0003", 50);
		
		String nom1 = p1.getNombre();
		String nom2 = p2.getNombre();

		System.out.println("¿¿ Es mayor " + nom1 + " que " + nom2 + " ??");
		System.out.println(p1.esMayorQue(p2));

	}

}

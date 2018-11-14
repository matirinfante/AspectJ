package EjercicioSimple;

public class Persona {

	private String nombre;
	private String DNI;
	private int edad;

	public Persona(String name, String id, int age) {
		this.nombre = name;
		this.DNI = id;
		this.edad = age;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean esMayorQue(Persona p2) {
		return this.edad > p2.edad;
	}

	@Override
	public String toString() {
		String s = "";
		s += "NOMBRE: " + nombre + "\n";
		s += "DNI: " + DNI + "\n";
		s += "EDAD: " + edad + "\n";
		return s;
	}

}

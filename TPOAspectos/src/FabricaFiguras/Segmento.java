package FabricaFiguras;

public class Segmento implements ElementoFigura {

	private String color;
	private int inicio;
	private int fin;

	public Segmento(int inicio, int fin) {
		this.inicio = inicio;
		this.fin = fin;
	}

	public void setInicio(int x) {
		this.inicio = x;
	}

	public void setFin(int y) {
		this.fin = y;
	}

	public void setColor(String col) {
		this.color = col;
	}

	@Override
	public void trasladarse(int x, int y) {
		System.out.println("Posicion Actual X= " + inicio + " Y= " + fin);
		inicio += x;
		fin += y;
		System.out.println("Punto se traslada a X=" + inicio + " Y= " + fin);
	}

	@Override
	public void colorear(String color) {

		this.color = color;
		System.out.println("Pintado de color" + this.color);
	}

}

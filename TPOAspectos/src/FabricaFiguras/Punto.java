package FabricaFiguras;

public class Punto implements ElementoFigura {
	private String color;
	private int posX;
	private int posY;

	public Punto(int x, int y) {
		posX = x;
		posY = y;
	}

	@Override
	public void trasladarse(int x, int y) {
		System.out.println("Posicion Actual X= " + posX + " Y= " + posY);
		posX += x;
		posY += y;
		System.out.println("Punto se traslada a X=" + posX + " Y= " + posY);
	}

	@Override
	public void colorear(String color) {

		this.color = color;
		System.out.println("Pintado de color" + this.color);
	}

}

package FabricaFiguras;

public class Circulo implements ElementoFigura {
	private String color;
	private int [] centro;
	private int radio;
	
	public Circulo(int[] centro, int radio) {
		this.centro = centro;
		this.radio = radio;
	}

	public int getRadio() {
		return this.radio;
	}

	@Override
	public void trasladarse(int x, int y) {
		System.out.println("Posicion Actual X= "+centro[0]+" Y= "+centro[1]);
		centro[0] += x;
		centro[1] += y;
		System.out.println("Punto se traslada a X="+centro[0]+" Y= "+centro[1]);
	}

	@Override
	public void colorear(String color) {	
		this.color = color;
		System.out.println("Pintado de color"+this.color);
	}

}

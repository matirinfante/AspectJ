package FabricaFiguras;

public class Circulo implements ElementoFigura {
	private String color;
	private int posX;
	private int posY;
	private int [] centro = {posX,posY};
	private int radio;
	
	public int getRadio() {
		return this.radio;
	}

	@Override
	public void trasladarse(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colorear(String color) {
		// TODO Auto-generated method stub

	}

}

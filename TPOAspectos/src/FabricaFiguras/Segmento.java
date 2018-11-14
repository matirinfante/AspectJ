package FabricaFiguras;

public class Segmento implements ElementoFigura {

	private String color;
	private int posX;
	private int posY;

	public void setX(int x) {
		this.posX = x;
	}

	public void setY(int y) {
		this.posY = y;
	}

	public void setColor(String col) {
		this.color = col;
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

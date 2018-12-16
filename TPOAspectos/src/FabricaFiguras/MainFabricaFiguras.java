package FabricaFiguras;

public class MainFabricaFiguras {
	public static void main(String[] args) {
		FabricaFiguras fab = new FabricaFiguras();
		int[] a ={1,2};
		fab.armarCirculo(a, 4);
		fab.armarSegmento(1, 5);
		fab.armarPunto(8, 8);
		
		//Colorear figuras bien
		fab.colorearFigura("ROSA",0);
		fab.colorearFigura("VERDE",1);
		fab.colorearFigura("ROJO",2);
		
		//Colorear figuras mal
		fab.colorearFigura("ROSA",0);
		fab.colorearFigura("ROSA",1);
		fab.colorearFigura("VIOLETA",0);
		
		//Punto diagonal
		fab.getCol(2).trasladarse(1, 1);
		
	}
}

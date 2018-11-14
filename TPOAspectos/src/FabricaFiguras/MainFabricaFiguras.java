package FabricaFiguras;

public class MainFabricaFiguras {
	public static void main(String[] args) {
		FabricaFiguras fab = new FabricaFiguras();
		int[] a ={1,2};
		fab.armarCirculo(a, 4);
		fab.armarSegmento(1, 5);
		fab.armarPunto(8, 8);
		
		//Colorear figuras bien
		fab.colorear("AZUL",0);
		fab.colorear("VERDE",1);
		fab.colorear("ROJO",2);
		
		//Colorear figuras mal
		fab.colorear("ROSA",0);
		fab.colorear("ROSA",1);
		fab.colorear("VIOLETA",2);
		
		//Punto diagonal
		fab.getCol(2).trasladarse(1, 1);
		
	}
}

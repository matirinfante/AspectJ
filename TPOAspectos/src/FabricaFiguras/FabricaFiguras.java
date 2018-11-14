package FabricaFiguras;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FabricaFiguras {
	private ArrayList<ElementoFigura> colFiguras;
	private static List<String> coloresValidos = Arrays.asList("AZUL", "VERDE", "ROJO", "AMARILLO");
	
	
	
	public FabricaFiguras() {
		this.colFiguras = new ArrayList<>();
	}

	public void armarPunto(int x, int y) {
		 colFiguras.add(new Punto(x,y));
	}
	
	public void armarSegmento(int inicio, int fin) {
		 colFiguras.add(new Segmento(inicio,fin));
	}

	public void armarCirculo(int[] centro, int radio) {
		colFiguras.add(new Circulo(centro,radio));
	}
	
	public void colorear(String color, int pos) {
		colFiguras.get(pos).colorear(color);
	}
	
	public ElementoFigura getCol(int pos) {
		return colFiguras.get(pos);
	}
}

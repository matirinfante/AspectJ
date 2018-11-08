package FabricaFiguras;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FabricaFiguras {
	private ArrayList<ElementoFigura> colFiguras;
	private List<String> coloresValidos;

	public FabricaFiguras() {
		this.colFiguras = new ArrayList<>();
		this.coloresValidos = Arrays.asList("AZUL", "VERDE", "ROJO", "AMARILLO");
	}

	public Punto armarPunto(int x, int y) {
		return null;
	}

	public Segmento armarSegmento(int inicio, int fin) {
		return new Segmento();
	}

	public Circulo armarCirculo(int centro, int radio) {
		return new Circulo();
	}
}

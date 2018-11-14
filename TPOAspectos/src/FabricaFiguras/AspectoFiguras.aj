package FabricaFiguras;

public aspect AspectoFiguras {

//POINTCUT PARA METODOS PUBLICOS DE LA CLASE FABRICAFIGURAS
//--------------------------------------------------------------------------------------------
	pointcut metodosPublicos(): execution (public * FabricaFiguras.*(..));
	
	before(): metodosPublicos(){
		System.out.println("Antes de entrar a un metodo publico de la clase FabricaFiguras");
	}
	
	after(): metodosPublicos(){
		System.out.println("Saliendo de un metodo pubico de la clase FabricaFiguras");
	}
	
//POINTCUT PARA TODOS LOS METODOS QUE COMIENCEN SON SET DE LA CLASE SEGMENTO
//---------------------------------------------------------------------------------------------

	pointcut setSegmento(): execution (* Segmento.set*(..));
	
	before(): setSegmento(){
		System.out.println("Antes de entrar a un metodo SET de la clase Segmento");
	}
	
	after(): setSegmento(){
		System.out.println("Saliendo de un metodo SET de la clase Segmento");
	}
	
}

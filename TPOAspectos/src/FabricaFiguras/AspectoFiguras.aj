package FabricaFiguras;

public aspect AspectoFiguras {

//---------------------------------------------------------------------------------------------
//POINTCUT PARA METODOS PUBLICOS DE LA CLASE FABRICAFIGURAS
//--------------------------------------------------------------------------------------------
	pointcut metodosPublicos(): execution (public * FabricaFiguras.*(..));

	before(): metodosPublicos(){
		System.out.println("Antes de entrar a un metodo publico de la clase FabricaFiguras");
	}

	after(): metodosPublicos(){
		System.out.println("Saliendo de un metodo pubico de la clase FabricaFiguras");
	}

//---------------------------------------------------------------------------------------------
//POINTCUT PARA TODOS LOS METODOS QUE COMIENCEN SON SET DE LA CLASE SEGMENTO
//---------------------------------------------------------------------------------------------

	pointcut setSegmento(): execution (* Segmento.set*(..));

	before(): setSegmento(){
		System.out.println("Antes de entrar a un metodo SET de la clase Segmento");
	}

	after(): setSegmento(){
		System.out.println("Saliendo de un metodo SET de la clase Segmento");
	}

//---------------------------------------------------------------------------------------------
//POINTCUT PARA CAPTURAR LOS MOVIMIENTOS EN DIAGONAL
//---------------------------------------------------------------------------------------------

	
    before(int x, int y): execution (void *.trasladarse(int,int)) && args(x,y) {
		
		if (x == 0 || y == 0) {
			System.out.println("El movimiento NO es diagonal");
		}else {
			System.out.println("El movimiento ES diagonal");
		}
	}
	
	
	
	
//---------------------------------------------------------------------------------------------
//POINTCUT PARA COLOREAR CON EXITO Y CON EXEPCION
//---------------------------------------------------------------------------------------------

    
    
    
	
	
	
	
//---------------------------------------------------------------------------------------------
//NO PERMITIR COLOREAR UN CIRCULO CON RADIO MENOR A XX (10)
//---------------------------------------------------------------------------------------------

	void around(Circulo circulo): execution (void Circulo.colorear(String)) && target (circulo){
		
		if(circulo.getRadio() < 10) {
			
			System.out.println("El Radio es menor al permitido para colorear");
			
		}else {
			
			System.out.println("El Radio cumple los requisitos");
			proceed(circulo);
			
		}
		
		
	}
	
	
	
	
}

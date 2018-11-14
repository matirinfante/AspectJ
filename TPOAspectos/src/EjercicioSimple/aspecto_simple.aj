package EjercicioSimple;

import java.util.ArrayList;

public aspect aspecto_simple {
	ArrayList<String> lista = new ArrayList<>();

//------------------------------------------------------------------------------------
//
//------------------------------------------------------------------------------------
	after(Persona persona): execution (*.new(..)) && target (persona) && within(EjercicioSimple.*){
		lista.add(persona.toString());
	}

//------------------------------------------------------------------------------------
//
//------------------------------------------------------------------------------------

	after(): execution (void Main_Simple.main(..)){
		for (String string : lista) {
			System.out.println(string);
		}
	}
	
//------------------------------------------------------------------------------------
//
//------------------------------------------------------------------------------------
	pointcut metodoLlamado(): call (* Persona.*(..));

	before(): metodoLlamado(){
		System.out.println("Un metodo es llamado");
	}

	after(): metodoLlamado(){
		System.out.println("Llamada completada");
	}

}

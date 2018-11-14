package EjercicioSimple;

public aspect aspecto_simple {

	pointcut contar(): call (void Contador.sumar());

	before(): contar(){
		System.out.println("Se va a llamar el metodo SUMAR");
	}

	after(): contar(){
		System.out.println(" Llamada al metodo SUMAR finalizada");
	}

}

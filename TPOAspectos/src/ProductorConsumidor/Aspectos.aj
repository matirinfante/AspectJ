package ProductorConsumidor;

public aspect Aspectos {
 pointcut agregar() :
	 execution (void buffer.agregar());
 
 before: agregar() {
	 
 }
	 
}

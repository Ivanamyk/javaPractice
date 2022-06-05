package ejercicio.ascensor.test;

import ejercicio.ascensor.dominio.Ascensor;

public class Test {
	//args stands for arguments; if i pass on something
	public static void main(String []args) {
		//first object
		//i create/instantiate new variable from the main class; new object
		 Ascensor ascensor = new Ascensor();
		 
		//execute object's methods 
		ascensor.bajar();		
		ascensor.subir();
		
		//to assign a value i need to use the setter previously added in the class Ascensor
		ascensor.setMarca("Lion");
		ascensor.setNumeroSerie(1234);
		System.out.println(ascensor.getMarca());
		System.out.println(ascensor.getNumeroSerie());
		
		//second object
		Ascensor ascensor2 = new Ascensor();
		
		ascensor2.setMarca("Cuchu");
		ascensor2.setNumeroSerie(456);
		System.out.println(ascensor2.getMarca());
		System.out.println(ascensor2.getNumeroSerie());
		ascensor2.bajar();
		ascensor2.subir();
		
	}
}

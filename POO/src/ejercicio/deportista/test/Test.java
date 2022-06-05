package ejercicio.deportista.test;

import ejercicio.deportista.dominio.Deportista;

public class Test {
	public static void main(String args[]) {
		
		Deportista deportista = new Deportista();
		
		deportista.setApellido("Mongo");
		deportista.setNombre("Lolo");
		deportista.setDeporteQuePractica("Natacion");
		
		System.out.println(deportista.getApellido());
		System.out.println(deportista.getNombre());
		System.out.println(deportista.getDeporteQuePractica());
		
		deportista.correr();
		deportista.saltar();
		deportista.descansar();
	}
}

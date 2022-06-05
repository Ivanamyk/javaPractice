package ejercicio.avion.test;

import ejercicio.avion.dominio.Avion;

public class Test {
	public static void main(String args[]){
		
		Avion avion = new Avion();
		
		avion.aterrizar();
		avion.volar();
		
		avion.setModelo("Pinguito");
		avion.setCapDePersonas(200);
		avion.setAlturaMaxima(30.10);
		
		System.out.println(avion.getModelo());
		System.out.println(avion.getCapDePersonas());
		System.out.println(avion.getAlturaMaxima());
	}
}

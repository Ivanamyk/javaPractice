package ejercicioHerencia1b.test;

import ejercicioHerencia1b.domain.Taxi;

public class TestTaxi {
	public static void main(String[] args) {
		
		Taxi taxi1 = new Taxi(4, "lolo", "ff56", "aceite",1030406);
		
		System.out.print(taxi1.getCantidadRuedas());
		System.out.print("-");
		System.out.print(taxi1.getModelo());
		System.out.print("-");
		System.out.print(taxi1.getPatente());
		System.out.print("-");
		System.out.print(taxi1.getTipoCombustible());
		System.out.print("-");
		System.out.print(taxi1.getNumeroLicencia());
		System.out.println("");
	
		taxi1.arrancar();
		taxi1.frenar();
		taxi1.abrirPuerta();
	}
}

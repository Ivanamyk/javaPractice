package ejercicioHerencia1b.test;

import ejercicioHerencia1b.domain.Autobus;

public class TestAutobus {
public static void main(String[] args) {
		
		Autobus autobus1 = new Autobus(5, "monchito", "hll67", "aceite", 30);
		
		System.out.print(autobus1.getCantidadRuedas());
		System.out.print("-");
		System.out.print(autobus1.getModelo());
		System.out.print("-");
		System.out.print(autobus1.getPatente());
		System.out.print("-");
		System.out.print(autobus1.getTipoCombustible());
		System.out.print("-");
		System.out.print(autobus1.getNumeroAsientos());
		System.out.println("");
	
		autobus1.arrancar();
		autobus1.frenar();
		autobus1.abrirPuerta();
		
	}
}

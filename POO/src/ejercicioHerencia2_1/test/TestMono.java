package ejercicioHerencia2_1.test;

import ejercicioHerencia2.domain.Mono;

public class TestMono {
	public static void main(String[] args) {
		
		Mono monito1 = new Mono("marron", "bananas", 17, 4);
		
		System.out.println("el mono es de color " + monito1.getColor() + ", come " + monito1.getTipoAlimentacion() + ", tiene " + monito1.getEdad() + " años y tiene " + monito1.getCantidadPatas() + " patas");
		monito1.trepar();
	}
}

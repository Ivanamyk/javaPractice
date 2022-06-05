package ejercicioHerencia2_1.test;

import ejercicioHerencia2.domain.Pez;

public class TestPez {
	public static void main(String[] args) {

		Pez pececito = new Pez("naranja", 8, 0.90);
		
		System.out.println("el pez es de color " + pececito.getColor() +", tiene " + pececito.getEdad() + " años y pesa " + pececito.getPeso() + " gramos");
		pececito.nadar();
	}
}

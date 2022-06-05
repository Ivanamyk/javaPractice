package ejercicioHerencia2_1.test;

import ejercicioHerencia2.domain.Perro;

public class TestPerro {
	public static void main(String[] args) {
		
		Perro perrito1 = new Perro("balanceado", 6, 4, "poodle");

		System.out.println("el perro come alimento " + perrito1.getTipoAlimentacion() + ", tiene " + perrito1.getEdad() + " años, " + "cuenta con " + perrito1.getCantidadPatas() + " patas y su raza es " + perrito1.getRaza());
		perrito1.ladrar();
	}
}

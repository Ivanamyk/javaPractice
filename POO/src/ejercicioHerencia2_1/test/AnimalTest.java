package ejercicioHerencia2_1.test;

import ejercicioHerencia2_1.domain.Pez;
import ejercicioHerencia2_1.domain.Mono;
import ejercicioHerencia2_1.domain.Perro;
import ejercicioHerencia2_1.domain.Animal;
import ejercicioHerencia2_1.domain.Loro;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animales[] = new Animal[4];
		Pez pececito = new Pez("naranja", 8, 0.90);
		animales[0] = pececito;

		System.out.println("el pez es de color " + pececito.getColor() + ", tiene " + pececito.getEdad()
				+ " años y pesa " + pececito.getPeso() + " gramos");
		pececito.nadar();

		
		
		Mono monito1 = new Mono("marron", "bananas", 17, 4);
		animales[1] = monito1;
		System.out.println("el mono es de color " + monito1.getColor() + ", come " + monito1.getTipoAlimentacion()
				+ ", tiene " + monito1.getEdad() + " años y tiene " + monito1.getCantidadPatas() + " patas");
		monito1.trepar();
		
		
		Perro perrito1 = new Perro("balanceado", 6, 4, "poodle");
		animales[2] = perrito1;
		System.out.println("el perro come alimento " + perrito1.getTipoAlimentacion() + ", tiene " + perrito1.getEdad() + " años, " + "cuenta con " + perrito1.getCantidadPatas() + " patas y su raza es " + perrito1.getRaza());
		perrito1.ladrar();
		
		
		Loro lorito = new Loro(5);
		animales[3] = lorito;

		mostrarAnimales(animales);
	}

	private static void mostrarAnimales(Animal animales[]) {
		System.out.println("-------------");
		for (int i = 0; i < animales.length; i++) {
			if (animales[i] != null) {
				System.out.println(animales[i].toString());
				animales[i].seComporta();
				
				System.out.println("...............");
				
				//esto NO es polimorfismo
				if(animales[i] instanceof Pez) {//verificar si la instancia del objeto en el vector es del tipo Pez
					((Pez)animales[i]).nadar();//casteo de animal a pez
				} else if(animales[i] instanceof Mono) {//verificar si la instancia del objeto en el vector es del tipo Pez
					((Mono)animales[i]).trepar();//casteo de animal a mono
				} else if(animales[i] instanceof Perro) {//verificar si la instancia del objeto en el vector es del tipo Pez
					((Perro)animales[i]).ladrar();//casteo de animal a perro
				} else {
					System.out.println("tipo no identificado");
				}
			
			}
		}

	}

}

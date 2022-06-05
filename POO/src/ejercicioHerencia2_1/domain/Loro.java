package ejercicioHerencia2_1.domain;

public class Loro extends Animal {

	public Loro(Integer edad) {
		super(edad);

	}

	@Override
	public void seComporta() {
		System.out.println("soy un loro");

	}

}

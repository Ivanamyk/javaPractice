package ejercicioHerencia2_1.domain;

public abstract class Animal {
	private Integer edad;
	
	//Contructor
	public Animal(Integer edad) {
		this.edad = edad;
	}

	
	//getters & setters

	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}



	//Metodos; al ser modo abstarcto no lo defino
	public abstract void seComporta();
	
	
	@Override
	public String toString() {
		return "Animal [edad=" + edad + "]";
	}
	
	
	
}

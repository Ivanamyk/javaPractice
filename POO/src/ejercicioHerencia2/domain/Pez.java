package ejercicioHerencia2.domain;

public class Pez extends Animal{
	private Double peso;
	
	public Pez(String color, Integer edad, Double peso) {
		super(color, null, edad, null);
		this.peso = peso;
	}

	//getters & setters propios de la clase
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	//metodos
	public void nadar() {
		System.out.println("El pez está nadando");
	}

	
	
	
	@Override
	public String toString() {
		return "Pez [peso=" + peso + "]";
	}
	
	
	
	
}

package ejercicioHerencia2_1.domain;

public class Pez extends Animal{
	private String color;
	private Double peso;
	
	public Pez(String color, Integer edad, Double peso) {
		super(edad);
		this.peso = peso;
		this.color=color;
	}

	//getters & setters propios de la clase
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//metodos
	public void nadar() {
		System.out.println("El pez está nadando");
	}

	
	
	
	@Override
	public String toString() {
		return "Pez [color=" + color + ", peso=" + peso + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void seComporta() {
		nadar();
		
	}
	
	
	
	
}

package ejercicioHerencia2_1.domain;

public class Mono extends Animal {
	private String color;
	private String tipoAlimentacion;
	private Integer cantidadPatas;

	public Mono(String color, String tipoAlimentacion, Integer edad, Integer cantidadPatas) {
		super(edad);
		this.color = color;
		this.tipoAlimentacion = tipoAlimentacion;
		this.cantidadPatas = cantidadPatas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

	public Integer getCantidadPatas() {
		return cantidadPatas;
	}

	public void setCantidadPatas(Integer cantidadPatas) {
		this.cantidadPatas = cantidadPatas;
	}
	
	

	// Metodo
	public void trepar() {
		System.out.println("El mono está trapando");
	}

	@Override
	public String toString() {
		return "Mono [color=" + color + ", tipoAlimentacion=" + tipoAlimentacion + ", cantidadPatas=" + cantidadPatas
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public void seComporta() {
	trepar();
		
	}

}

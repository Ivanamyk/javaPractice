package ejercicioHerencia2.domain;

public class Animal {
	private String color;
	private String tipoAlimentacion;
	private Integer edad;
	private Integer cantidadPatas;
	
	//Contructor
	public Animal(String color, String tipoAlimentacion, Integer edad, Integer cantidadPatas) {
		this.color = color;
		this.tipoAlimentacion = tipoAlimentacion;
		this.edad = edad;
		this.cantidadPatas = cantidadPatas;
	}

	
	//getters & setters
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

	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getCantidadPatas() {
		return cantidadPatas;
	}
	public void setCantidadPatas(Integer cantidadPatas) {
		this.cantidadPatas = cantidadPatas;
	}


	//Metodos
	
	
	
	@Override
	public String toString() {
		return "Animal [color=" + color + ", tipoAlimentacion=" + tipoAlimentacion + ", edad=" + edad
				+ ", cantidadPatas=" + cantidadPatas + "]";
	}
	
	
	
}

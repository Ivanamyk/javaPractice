package ejercicioHerencia2.domain;


public class Mono extends Animal{

	public Mono (String color, String tipoAlimentacion, Integer edad, Integer cantidadPatas) {
		super(color, tipoAlimentacion, edad, cantidadPatas);
	}
	
	//Metodo
	public void trepar() {
		System.out.println("El mono está trapando");
	}

	
	
	@Override
	public String toString() {
		return "Mono [getColor()=" + getColor() + ", getTipoAlimentacion()=" + getTipoAlimentacion() + ", getEdad()="
				+ getEdad() + ", getCantidadPatas()=" + getCantidadPatas() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}

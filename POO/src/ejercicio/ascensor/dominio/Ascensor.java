package ejercicio.ascensor.dominio;

public class Ascensor {
	
	private Integer numeroSerie;
	private String marca;
	
	public Integer getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(Integer numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void subir() {
	System.out.println("sube");	
	}
	public void bajar() {
		System.out.println("baja");	
	}
		
	
}

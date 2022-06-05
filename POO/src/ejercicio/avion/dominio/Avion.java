package ejercicio.avion.dominio;

public class Avion {
	public String modelo;
	public Integer capDePersonas;
	public Double alturaMaxima;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getCapDePersonas() {
		return capDePersonas;
	}
	public void setCapDePersonas(Integer capDePersonas) {
		this.capDePersonas = capDePersonas;
	}
	public Double getAlturaMaxima() {
		return alturaMaxima;
	}
	public void setAlturaMaxima(Double alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}
	
	public void volar() {
		System.out.println("esta volando");
	}
	public void aterrizar() {
		System.out.println("esta aterrizando");
	}
}

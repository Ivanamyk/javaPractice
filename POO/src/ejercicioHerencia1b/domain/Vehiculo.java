package ejercicioHerencia1b.domain;

public class Vehiculo {
	private Integer cantidadRuedas;
	private String modelo;
	private String patente;
	private String tipoCombustible;
	
	
	//constructor
	public Vehiculo(Integer cantidadRuedas, String modelo, String patente, String tipoCombustible){
		this.cantidadRuedas = cantidadRuedas;
		this.modelo = modelo;
		this.patente = patente;
		this.tipoCombustible = tipoCombustible;
	}

	//getters & setters
	public Integer getCantidadRuedas() {
		return cantidadRuedas;
	}
	public void setCantidadRuedas(Integer cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	//metodos
	public void abrirPuerta() {
		System.out.println("Se está abriendo la puerta");
	}

	
	@Override
	public String toString() {
		return "Vehiculo [cantidadRuedas=" + cantidadRuedas + ", modelo=" + modelo + ", patente=" + patente
				+ ", tipoCombustible=" + tipoCombustible + "]";
	}
	
	
	
}

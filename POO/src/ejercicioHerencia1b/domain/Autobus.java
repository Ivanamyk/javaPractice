package ejercicioHerencia1b.domain;

public class Autobus extends Vehiculo {
	private Integer numeroAsientos;

	//constructor propio y que hereda atributos del padre
	public Autobus(Integer cantidadRuedas, String modelo, String patente, String tipoCombustible, Integer numeroAsientos) {
		super(cantidadRuedas, modelo, patente, tipoCombustible);
		this.numeroAsientos = numeroAsientos;
	}

	//getters & setters propios
	public Integer getNumeroAsientos() {
		return numeroAsientos;
	}
	public void setNumeroAsientos(Integer numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	
	//Metodos propios
	public void arrancar() {
		System.out.println("el autobus arranco");
	}
	public void frenar() {
		System.out.println("el autobus freno");
	}
	
	
	
	@Override
	public String toString() {
		return "Autobus [numeroAsientos=" + numeroAsientos + "]";
	}
	
	
}

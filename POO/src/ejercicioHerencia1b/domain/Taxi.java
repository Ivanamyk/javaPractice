package ejercicioHerencia1b.domain;

public class Taxi extends Vehiculo{
	private Integer numeroLicencia;

	//constructor propio y que hereda atributos del padre
	public Taxi(Integer cantidadRuedas, String modelo, String patente, String tipoCombustible, Integer numeroLicencia) {
		super(cantidadRuedas, modelo, patente, tipoCombustible);
		this.numeroLicencia = numeroLicencia;
	}

	//getters & setters
	public Integer getNumeroLicencia() {
		return numeroLicencia;
	}
	public void setNumeroLicencia(Integer numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}

	
	//metodos propios
	public void arrancar() {
		System.out.println("el taxi arranco");
	}
	public void frenar() {
		System.out.println("el taxi freno");
	}
	
	
	
	
	@Override
	public String toString() {
		return "Taxi [numeroLicencia=" + numeroLicencia + "]";
	}

	
	
	
}

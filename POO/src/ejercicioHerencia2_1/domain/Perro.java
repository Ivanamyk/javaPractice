package ejercicioHerencia2_1.domain;

public class Perro extends Animal {
	private String raza;
	private String tipoAlimentacion;
	private Integer cantidadPatas;

	public Perro(String tipoAlimentacion, Integer edad, Integer cantidadPatas, String raza) {
		super(edad);
		this.raza = raza;
		this.tipoAlimentacion = tipoAlimentacion;
		this.cantidadPatas = cantidadPatas;
	}

	// geter & setter propio; si no tengo ninguno y son todos heredados del padre,
	// los getters y setters no se pueden construir
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
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

	// Metodos
	public void ladrar() {
		System.out.println("El perro está ladrando");
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", tipoAlimentacion=" + tipoAlimentacion + ", cantidadPatas=" + cantidadPatas
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public void seComporta() {
	ladrar();
		
	}

}

package ejercicioHerencia2.domain;

public class Perro extends Animal {
	private String raza;
	
	public Perro (String tipoAlimentacion, Integer edad, Integer cantidadPatas, String raza) {
		super(null, tipoAlimentacion, edad, cantidadPatas);
		this.raza=raza;
	}

	//geter & setter propio; si no tengo ninguno y son todos heredados del padre, los getters y setters no se pueden construir
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	//Metodos
	public void ladrar() {
		System.out.println("El perro está ladrando");
	}

	
	
	
	@Override
	public String toString() {
		return "Perro [raza=" + raza + "]";
	}
	
	
}

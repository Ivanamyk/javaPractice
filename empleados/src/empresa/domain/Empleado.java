package empresa.domain;

public abstract class Empleado {
	private String nombre;
	private Integer edad;
	private Double salario;
	protected static final Integer PLUS=300;
	
	//constructor
	public Empleado(String nombre, Integer edad, Double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	//getters & setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	public abstract double hacePlus();
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}
	
	
	
	
}

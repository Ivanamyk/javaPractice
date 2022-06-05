package empresa.domain;

public class EmpComercial extends Empleado {
	private Double comision;

	// constructor con herencia del padre; "super" sdjhsfij
	public EmpComercial(String nombre, Integer edad, Double salario, Double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	// getters & setters
	public Double getComision() {
		return comision;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}

	

	@Override
	public String toString() {
		return "EmpComercial [comision=" + comision + "]";
	}
	
	// metodo de la clase padre que traigo hasta aca para usar el poli y cambiar su
	// efecto
	@Override
	public double hacePlus() {
		double result = 0.0;
		if(getEdad() > 30 && comision >=200.00) {
			result = getSalario() + PLUS;
		}else {
			System.out.println("no tiene plus");
		}
		return result;
	}

}

package empresa.domain;

public class EmpRepartidor extends Empleado{
	private String zona;
	
	//constructor
	public EmpRepartidor(String nombre, Integer edad, Double salario, String zona) {
		super(nombre, edad, salario);
		this.zona=zona;
	}

	//getters & setters
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}

	
	
	@Override
	public String toString() {
		return "EmpRepartidor [zona=" + zona + "]";
	}

	@Override
	public double hacePlus() {
		double result = 0.0;
		if(getEdad() < 25 && zona.equalsIgnoreCase("zona 3")) {
			result = getSalario() + PLUS;
		}else {
			System.out.println("no tiene plus");
		}
		return result;
		
	}

}

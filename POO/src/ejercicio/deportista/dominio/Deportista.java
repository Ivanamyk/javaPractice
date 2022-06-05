package ejercicio.deportista.dominio;

public class Deportista {
	public String nombre;
	public String apellido;
	public String deporteQuePractica;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDeporteQuePractica() {
		return deporteQuePractica;
	}
	public void setDeporteQuePractica(String deporteQuePractica) {
		this.deporteQuePractica = deporteQuePractica;
	}
	
	public void correr() {
		System.out.println("esta corriendo!");
	}
	public void saltar() {
		System.out.println("esta saltando!");
	}
	public void descansar() {
		System.out.println("esta descansando.");
	}
	
}

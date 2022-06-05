package cajAutomatico.dominio;

public class CajeroAutomatico {
	private String nombre;
	private Integer dni;
	private String codigoAcceso;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getCodigoAcceso() {
		return codigoAcceso;
	}
	public void setCodigoAcceso(String codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
	}
	
	public void retirarDinero() {
		System.out.println("retiro dinero");
	}
	public void transferirDinero() {
		System.out.println("transfiriendo dinero");
	}
	public void salirDeLaSesion() {
		System.out.println("salgo de la sesion");	
	}
	
}

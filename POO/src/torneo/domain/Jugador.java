package torneo.domain;

public class Jugador {
	
	//los atributos siempre privados
	private String nombre;
	private Equipo equipo;
	private Integer cantidadGoles;

	//constructor para inicializar cantidadJugadores (no es para nada mas que darle un valor inicial y que no sea null)
	public Jugador() {
		cantidadGoles=0;
	}
	

	//constructor
	public Jugador(String nombre, Equipo equipo) {
		this();
		this.nombre = nombre;
		this.equipo = equipo;
	}


	//getters y setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public Integer getCantidadGoles() {
		return cantidadGoles;
	}
	public void setCantidadGoles(Integer cantidadGoles) {
		this.cantidadGoles = cantidadGoles;
	}
	
	
	public Equipo getEquipo() {
		return equipo;
}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	//metodo que incrementa goles a un jugador
	public void convierteGol() {
		cantidadGoles++;
	}
	
	
	
	//to string
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", equipo=" + ((equipo!=null)?equipo.getClass().getName():equipo) + ", cantidadGoles=" + cantidadGoles + "]";
	}



}

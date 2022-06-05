package torneo.domain;

public class Partido {
	//creo constantes
	public final static String LOCAL="local";
	public final static String VISITANTE="visitante";
	public final static String EMPATE="empate";
	
	private Equipo local;
	private Equipo visitante;
	private String resultado;
	
	
	//constructor
	public Partido(Equipo local, Equipo visitante, String resultado) {
		this.local = local;
		this.visitante = visitante;
		this.resultado = resultado;
	}


	public Equipo getLocal() {
		return local;
	}
	public void setLocal(Equipo local) {
		this.local = local;
	}


	public Equipo getVisitante() {
		return visitante;
	}
	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}


	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	//metodo
	public void gol(Equipo equipo, Jugador jugador) {
		equipo.gol(jugador);
	}

	//sobrecarga
	public void gol(Equipo equipo, String nombreJugador) {
		Jugador encontrado = equipo.buscarJugador(nombreJugador);
		if(encontrado != null) {
			System.out.println(encontrado.toString());
			equipo.gol(encontrado);
		}else {
			System.out.println("No existe " + nombreJugador);
		}
	}
	
	@Override
	public String toString() {
		return "Partido [local=" + local + ", visitante=" + visitante + ", resultado=" + resultado + "]";
	}
	
	
	
}

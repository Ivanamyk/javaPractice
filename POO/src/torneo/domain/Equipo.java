package torneo.domain;

import java.util.Arrays;

public class Equipo {
	//lo hago una constante usando el final; static para que se quede en el ambito de las clases (que no se vaya con los objetos)
	private final static int CANTIDAD_JUGADORES=3;
	//como es una estructura de datos tiene que ser el nombre en plural. 
	private Jugador[] jugadores; //es un array []
	private String nombre;
	
	//constructor que me arma un equipo con cantidad de jugadores 3 en este caso
	public Equipo(String nombre) {
		jugadores = new Jugador[CANTIDAD_JUGADORES];
		this.nombre = nombre;
	}




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Jugador[] getJugadores() {
		return jugadores;
	}
	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	
	//aparte del Get y Set, cuando uso un Array creo un nuevo elemento que es Add
	public void addJugador(Jugador jugador) {
		for(int i=0; i<CANTIDAD_JUGADORES; i++) {
			if(jugadores[i]==null) {
				jugadores[i]=jugador;
				break;
			}
		}
		
		this.jugadores = jugadores;
	}
	
	public Jugador buscarJugador(String nombre) {
		Jugador resultado = null;
		for(int i=0; i<CANTIDAD_JUGADORES; i++) {
			if(jugadores[i] !=null &&jugadores[i].getNombre().equalsIgnoreCase(nombre)) {
				resultado=jugadores[i];
				break;
			}
		}
		return resultado;	
	}

	//metodos
	public void gol(Jugador jugador) {
		jugador.convierteGol();
	}


	@Override
	public String toString() {
		return "Nombre= " + nombre + ", Equipo [jugadores=" + Arrays.toString(jugadores)+"]";
	}

	
	
}

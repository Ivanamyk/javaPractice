package torneo.test;

import torneo.domain.Equipo;
import torneo.domain.Jugador;

public class JugadorTest {
	public static void main(String[] args) {
		
		Jugador jugador = new Jugador();	
		Jugador jugador2 = new Jugador("Mario", new Equipo("Pirulo"));
		//System.out.println(jugador2.toString());
		
		
		jugador.setCantidadGoles(10);
		jugador.convierteGol();
		
		System.out.println(jugador.toString());
	}
	
	

}

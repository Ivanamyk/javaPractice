package torneo.test;

import torneo.domain.Equipo;
import torneo.domain.Jugador;

public class EquipoTest {
	public static void main(String[] args) {
	
		Equipo equipo1 = new Equipo("Rayado"); 
		//System.out.println(equipo1.toString());

		
		Jugador j1 = new Jugador("Maria",equipo1);
		Jugador j2 = new Jugador("Marlene",equipo1);
		Jugador j3 = new Jugador("Martha",equipo1);
		
		
		equipo1.addJugador(j1);
		equipo1.addJugador(j2);
		equipo1.addJugador(j3);
		System.out.println(equipo1.toString());
		
		Jugador buscarMartha = equipo1.buscarJugador("Martha");
		if(buscarMartha != null) {
			buscarMartha.convierteGol();
		}
		System.out.println(buscarMartha.toString());
	
	
	
	
	}
}

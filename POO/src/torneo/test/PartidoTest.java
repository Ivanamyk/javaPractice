package torneo.test;

import torneo.domain.Equipo;
import torneo.domain.Partido;

public class PartidoTest {
	public static void main(String[] args) {
	
		Equipo local = new Equipo ("Rayado");
		Equipo visitante = new Equipo("Cuadrado");
		Partido nuevoPartido = new Partido(local, visitante, Partido.LOCAL);
		
		System.out.println(nuevoPartido);
		
		nuevoPartido.gol(local, "Martha");
		System.out.println(nuevoPartido);
		
}
	
	
	
	
	
}

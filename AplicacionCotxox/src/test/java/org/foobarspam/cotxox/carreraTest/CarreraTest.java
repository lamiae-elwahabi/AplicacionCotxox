package org.foobarspam.cotxox.carreraTest;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.carrera.Carrera;
import org.foobarspam.cotxox.conductores.*;

import org.junit.Test;

public class CarreraTest {

	
	@Test
	public void TestConstructorCarrera() {
		
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		
		//Instanciar el objeto carrera
		Carrera carrera = new Carrera(tarjetaCredito);
		
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		
		//assertEquals
		assertEquals(carrera.getOrigen(), "Aeroport Son Sant Joan");
		assertEquals(carrera.getDestino(), "Magaluf");
		assertEquals(carrera.getDistancia(), distancia, 0.0);
		assertEquals(carrera.getTiempoEsperado(), tiempoEsperadoMinutos, 0.0);

	}

}

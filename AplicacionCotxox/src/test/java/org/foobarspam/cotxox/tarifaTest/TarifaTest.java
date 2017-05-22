package org.foobarspam.cotxox.tarifaTest;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.carrera.Carrera;
import org.foobarspam.cotxox.tarifa.Tarifa;
import org.junit.Test;

public class TarifaTest {
	Tarifa tarifa = new Tarifa();
	@Test
	public void testCosteTotalEsperado() {
	
		//assertEquals(carrera.getDistancia())
		//double distancia = 10;
		//double distancia = 10;
		//assertTrue(tarifa.getCosteDistancia(2.4));
		//assertTrue(tarifa.getCosteEsperado(1.5));
		
	}
	@Test
	public void  testCosteDistancia() {
		assertTrue(tarifa.getCosteDistancia(10) == 13.5);
		
	}
	@Test
	public void testCosteTiempo() {
		//assertEquals(tarifa.getCosteTiempo(20), 7);
		assertTrue(tarifa.getCosteTiempo(20) == 7.0);
		}

}

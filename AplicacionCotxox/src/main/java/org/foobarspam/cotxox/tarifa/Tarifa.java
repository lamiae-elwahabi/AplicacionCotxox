package org.foobarspam.cotxox.tarifa;

import org.foobarspam.cotxox.carrera.Carrera;

public class Tarifa {
	//--Propiedades---
	private String id = " ";
	private final double costeMilla = 1.35;
	private final double costeMinuto = 0.35;
	private double costeMinimo = 5;
	private double porcentajeComision = 20;
	
	//Constructor por defecto
	public Tarifa() {

	}
	// Getters y setters 
	public double getCosteMilla() {
		return costeMilla;
	}

	public double getCosteMinuto() {
		return costeMinuto;
	}
	
	
	//Metodos
	
	public double getCosteDistancia(double distancia){
		return getCosteMilla() * distancia;
	}
	
	public double getCosteTiempo(double minutos){
		return getCosteMinuto() * minutos;
	}
	//Duda ( si así es inyection de dependencia)
	public double getCosteTotalEsperado(Carrera carrera){
		double costeDistancia = getCosteDistancia(carrera.getDistancia());
		double costeTiempo = getCosteTiempo(carrera.getTiempoEsperado());
		return costeDistancia + costeTiempo;
		
	}
	
	
	
}


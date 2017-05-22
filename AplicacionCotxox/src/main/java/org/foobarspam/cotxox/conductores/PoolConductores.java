package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class PoolConductores {
	
	private ArrayList<Conductor> poolConductores = null;
	
	//Constructor por defecto
	public PoolConductores(){
			
		}
	public PoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores = poolConductores;
		
	}

	public ArrayList<Conductor> getConductores() {
		return this.poolConductores;
	}

	public void setPoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores = poolConductores;
	}
	 public Conductor asignarConductor() {
		 getConductores().get(0).setOcupado(true);
		 return getConductores().get(0);
	 }
	

}

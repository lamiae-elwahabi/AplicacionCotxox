package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
	//Propiedades 
	private String nombre = " ";
	private String modelo = " ";
	private String matricula = " ";
	private double valoracionMedia = 0d;
	private ArrayList<Byte> valoraciones = new ArrayList<Byte>();
	private boolean ocupado = false;
	
	//Constructor por defecto
	public Conductor(){
			
		}
	//Constructor como se pide en main 
	public Conductor( String nombre){
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

	public ArrayList<Byte> getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(ArrayList<Byte> valoraciones) {
		this.valoraciones = valoraciones;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setValoracion(byte valoracion) {
		valoraciones.add(valoracion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValoracion() {
		double valoracionFinal = 0.0d;
		for( int i=0; i<getValoraciones().size(); i++) {
			valoracionFinal+=getValoraciones().get(i);
		}
		return valoracionFinal / getValoraciones().size();
	}

	public boolean isOcupado() {
		return this.ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
		
	}

	
	

}

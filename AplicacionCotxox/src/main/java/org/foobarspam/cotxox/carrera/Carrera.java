package org.foobarspam.cotxox.carrera;


import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {
	//---Propiedades----
	private double tiempoEsperado = 0d;
	private int tiempoCarrera = 0;
	private double costeTotal = 0d;
	private Conductor conductor = null;
	private String tarjetaCredito = " ";
	private String origen = " ";
	private String destino = " ";
	private double distancia = 0d;
	private int propina = 0;
	
	//Constructor por defecto
	public Carrera(){
		
	}
	//Constructor solo con tarjetaCredito como pide el main
	public Carrera(String tarjetaCredito) {
			this.tarjetaCredito = tarjetaCredito;
	}
	
	//----Getters y Setters----
	public double getTiempoEsperado() {
		return tiempoEsperado;
	}

	public void setTiempoEsperado(double tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public String getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	public int getPropina() {
		return propina;
	}
	public void setPropina(int propina) {
		this.propina = propina;
	}
	public double getCosteTotal() {
		return costeTotal;
	}
	public void setCosteTotal(double costeTotal) {
		this.costeTotal = costeTotal;
	}
	
	//---Metodos-----
	public double getCosteEsperado() {
		/*Devolver el coste esperado 
		es una responsabilidad de la clase Tarifa
		Instanciar el objeto tarifa de la clase Tarifa*/
		Tarifa tarifa = new Tarifa();
		double coste = tarifa.getCosteTotalEsperado(this);
		return coste;
	}

	public Conductor asignarConductor(PoolConductores conductores) {
		conductor = conductores.asignarConductor();
		setConductor(conductor);
		return conductor;
}
	public void realizarPago(double pago){
		this.costeTotal = pago;
	}
	public void recibirPropina(int propina) {
		this.propina = propina;
	}
	//Duda
	public void liberarConductor() {
		getConductor().setOcupado(false);
	}
	
}
	
	

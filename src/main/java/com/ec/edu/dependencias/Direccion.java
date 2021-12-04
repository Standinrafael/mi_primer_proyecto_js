package com.ec.edu.dependencias;

public class Direccion {
	
	private String callePrincipal;
	private String numeracion;
	
		
	
	//Metodos SET y GET
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getNumeracion() {
		return numeracion;
	}
	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}
	@Override
	public String toString() {
		return "Direccion [callePrincipal=" + callePrincipal + ", numeracion=" + numeracion + "]";
	}
	

}

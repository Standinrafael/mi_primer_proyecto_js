package com.ec.edu.inyeccion.dependencias.extendida;

public class EstudianteArquitectura extends Estudiante {
	
	private String idMunicipio;
	
	public void pagarServiPagos(String nombre) {
		
		System.out.println(nombre+" hace el pago ");
		
		System.out.println(nombre+" presenta el pago");
		
		System.out.println(nombre+ " PAYPAL");
	}

	public String getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(String idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	
	

}

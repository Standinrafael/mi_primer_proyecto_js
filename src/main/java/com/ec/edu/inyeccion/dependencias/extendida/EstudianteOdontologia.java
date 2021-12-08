package com.ec.edu.inyeccion.dependencias.extendida;

public class EstudianteOdontologia extends Estudiante {

	
	private String ciudadRural;
	
	
	public void pagarServiPagos(String nombre) {
		
		System.out.println(nombre+" hace el pago ");
		
		System.out.println(nombre+" presenta el pago");
		
		System.out.println(nombre+ " EFECTIVO");
	}
	
	
	
	//Metodos GET y SET	
		
	public String getCiudadRural() {
		return ciudadRural;
	}



	public void setCiudadRural(String ciudadRural) {
		this.ciudadRural = ciudadRural;
	}


}

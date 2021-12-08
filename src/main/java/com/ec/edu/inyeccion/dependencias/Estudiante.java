package com.ec.edu.inyeccion.dependencias;

public class Estudiante {

	private String nombre;
	private String apellido;
	
	private Direccion direccion;
	
	
	public void pagarServiPagos(String nombre) {
		
		
		System.out.println(nombre+ " hace el pago");
		System.out.println(nombre+ " presenta el pago");
	}
	
	//Metodos GET y SET
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
	

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}
	
	

	
}

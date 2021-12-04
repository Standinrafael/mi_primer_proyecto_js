package com.ec.edu.dependencias;

public class Matricula {
	
	private String semestre;
	private int anio;
	
	private Estudiante estudiante;
	
	public String matricular(String nombre, String apellido, String calle, String numero) {
		this.estudiante=new Estudiante();
		
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		
		
		Direccion direccion= new Direccion();
		direccion.setCallePrincipal(calle);
		direccion.setNumeracion(numero);
		this.estudiante.setDireccion(direccion);
		//logia para guardar en la base de datos los datos de la matricula
		//y el estudiante
		
		//se imprimer el espacio de memoria
		System.out.println(this.estudiante);
		return "Estudainte Guardado con exito";
	}
	
	//Metodos SET y GET
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	 

}

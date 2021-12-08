package com.ec.edu.inyeccion.dependencias;

import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner= new Scanner(System.in);
		System.out.println("Ingrese Nombre:");
		String nombre=scanner.nextLine();
		
		System.out.println("Ingrese Apellido:");
		String apellido=scanner.nextLine();
		
		System.out.println("Ingrese Calle:");
		String calle=scanner.nextLine();
		
		System.out.println("Ingrese Numeracion:");
		String numeracion=scanner.nextLine();
		
		
		//El framework me inyecta las dependencias Estudiante y Direccion
		Matricula matricula= new Matricula(new Estudiante(), new Direccion());
		
		
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		String mensaje=matricula.matricular(nombre, apellido, calle, numeracion);
		
		System.out.println(mensaje);
	}

}

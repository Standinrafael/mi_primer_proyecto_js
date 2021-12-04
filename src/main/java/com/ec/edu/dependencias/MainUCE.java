package com.ec.edu.dependencias;

import java.util.Scanner;

public class MainUCE {

	public static void main(String[] args) {
		
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Ingrese Nombre:");
		String nombre=scanner.nextLine();
		
		System.out.println("Ingrese Apellido:");
		String apellido=scanner.nextLine();
		
		System.out.println("Ingrese Calle:");
		String calle=scanner.nextLine();
		
		System.out.println("Ingrese Numeracion:");
		String numeracion=scanner.nextLine();
		
		// TODO Auto-generated method stub

		Matricula matricula= new Matricula();
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		String mensaje=matricula.matricular(nombre, apellido, calle, numeracion);
		
		System.out.println(mensaje);
		
		
	}

}

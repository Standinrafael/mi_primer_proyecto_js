package com.ec.edu.inyeccion.dependencias.extendida;

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
		System.out.println("Ingrese Tipo:");
		int tipo=scanner.nextInt();
		
		Estudiante estudiante;
		if(tipo==1) {
			estudiante =new Estudiante();
		} else if(tipo==2) {
			estudiante=new EstudianteOdontologia();
		}else if(tipo==3) {
			estudiante= new EstudianteArquitectura();
		}else {
			estudiante=new EstudianteAdministracion();
		}
		
		
		//El framework me inyecta las dependencias Estudiante y Direccion
		Matricula matricula= new Matricula(estudiante, new Direccion());
		
		
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		String mensaje=matricula.matricular(nombre, apellido, calle, numeracion);
		
		System.out.println(mensaje);
	}

}

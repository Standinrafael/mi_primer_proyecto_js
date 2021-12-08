package com.ec.edu.cuenta;

import java.util.Scanner;
import java.util.Random;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Tipo de Scanners
		int tipo;
		Scanner scanner= new Scanner(System.in);
		Scanner scanner1=new Scanner(System.in);
		Scanner scanner2= new Scanner(System.in);
		
		
		//Ingreso de Datos del cliente
		System.out.println("Ingrese el Nombre del Ciente:");
		String nombre=scanner.nextLine();
		System.out.println("Ingrese el Apellido del Cliente");
		String apellido=scanner.nextLine();
		System.out.println("Ingrese la Cedula del CLiente");
		String cedula=scanner.nextLine();
		
		//Menu de Opciones
		do {
			System.out.println();
			System.out.println();
			System.out.println("******BANCO BUENDIA*************");
			System.out.println("Buen dia Sr/a:"+nombre );	
			System.out.println("Ingrese el tipo de Cuenta que desea abrir:");
			System.out.println("1. Cuenta de Ahorros.");
			System.out.println("2. Cuenta Corriente.");
			System.out.println("3. Cuenta de Poliza.");
			System.out.println("4. Salir.");
			
			 tipo=scanner1.nextInt();
			
			CuentaAhorros cuenta;
			CuentaHabiente cliente;
			String mensaje;
			
			switch (tipo) {
			
			case 1:
				
				//Instancia de la cuenta y el cliente
				cuenta= new CuentaAhorros();
				cliente= new CuentaHabiente(cuenta);
				
				
				System.out.println();
				System.out.println("Ingrese el valor para la apertura de la cuenta");
				double monto=scanner2.nextDouble();
				
				//Envio de informacion
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setCedula(cedula);
				mensaje=cliente.abrirCuenta(monto);
				
				
				if (monto==100) {
					System.out.println();
					System.out.println("----------INFORMACION DE LA CUENTA DEL CLIENTE-----------------");
					System.out.println(cliente);
					System.out.println(mensaje);
					System.out.println("----------------------------------------------------------------");
					System.out.println();
					
				}else {
					System.out.println();
					System.out.println("----------INFORMACION DE LA CUENTA DEL CLIENTE-----------------");
					System.out.println("No existe informacion para la cuenta de:"+nombre);
					System.out.println("----------------------------------------------------------------");
					System.out.println();
				}
				
				System.out.println();
				
				break;
				
				
				
			case 2:
				
				//Instancia de la cuenta y el cliente
				cuenta= new CuentaCorriente();
				cliente= new CuentaHabiente(cuenta);
				
				
				System.out.println();
				System.out.println("Ingrese el valor para la apertura de la cuenta");
				double monto1=scanner2.nextDouble();
				
				//Envio de la informacion
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setCedula(cedula);
				mensaje=cliente.abrirCuenta(monto1);
				
				if (monto1==100) {
					System.out.println();
					System.out.println("----------INFORMACION DE LA CUENTA DEL CLIENTE-----------------");
					System.out.println(cliente);
					System.out.println(mensaje);
					System.out.println("----------------------------------------------------------------");
					System.out.println();
					
				}else {
					System.out.println();
					System.out.println("----------INFORMACION DE LA CUENTA DEL CLIENTE-----------------");
					System.out.println("No existe informacion para la cuenta de:"+nombre);
					System.out.println("----------------------------------------------------------------");
					System.out.println();
				}
				break;
				
			case 3:
				
				//Instancia de la cuenta y el cliente
				cuenta= new CuentaPoliza();
				cliente= new CuentaHabiente(cuenta);
				
				
				System.out.println();
				System.out.println("Ingrese el valor para la apertura de la cuenta");
				double monto2=scanner2.nextDouble();
				
				
				//Envio de la informacion
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setCedula(cedula);
				mensaje=cliente.abrirCuenta( monto2);
				
				
				if (monto2==100) {
					System.out.println();
					System.out.println("----------INFORMACION DE LA CUENTA DEL CLIENTE-----------------");
					System.out.println(cliente);
					System.out.println(mensaje);
					System.out.println("----------------------------------------------------------------");
					System.out.println();
					
				}else {
					System.out.println();
					System.out.println("----------INFORMACION DE LA CUENTA DEL CLIENTE-----------------");
					System.out.println("No existe informacion para la cuenta de:"+nombre);
					System.out.println("----------------------------------------------------------------");
					System.out.println();
				}
			
				break;
				
			default:
				
				//Mensaje de salida
				System.out.println();
				System.out.println("Gracias por su visita");
				System.out.println();
				break;
			
			
			}
			
		}while (tipo!=4);
		
		
		
		
		
	}

}

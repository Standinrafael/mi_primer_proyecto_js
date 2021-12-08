package com.ec.edu.cuenta;

import java.util.Random;

public class CuentaHabiente {
	
	private String nombre;
	private String apellido;
	private String cedula;
	
	//La cuenta de Ahorros es la cuenta padre de la que heredan las demas cuentas	
	private CuentaAhorros cuenta;
	
	
	//Se hace la inyeccion mediante el constructor
	public CuentaHabiente(CuentaAhorros cuenta) {
		this.cuenta=cuenta;		
	}
	
	
	//Metodo para Apertura de la Cuenta
	public String abrirCuenta( double saldo) {
		
		this.cuenta.setSaldo(saldo);			
		this.cuenta.aperturaCuenta(nombre,apellido,saldo);
		
		
		if(saldo==100) {
			
			//Mandar un numero de cuenta aleatorio independiente del tipo de cuenta que escoga el usuario
			int nC;
			String ncuenta;
			Random random= new Random();
			nC=random.nextInt(100+1)+1;
			//convertir el entero en String
			ncuenta=String.valueOf(nC);	
			cuenta.setNumeroCuenta(ncuenta);			
						
						
		}else {
			System.out.println();
			System.out.println("-----------------CUENTA NO ENCONTRADA----------");
			System.out.println();
		}
		
		return "Gracias por usar el servicio";
	}
	
	
	
	//Metodos Get y Set
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public CuentaAhorros getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaAhorros cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "CuentaHabiente [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", cuenta="
				+ cuenta + "]";
	}
	
	
	
	

}

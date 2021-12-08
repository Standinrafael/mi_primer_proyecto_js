package com.ec.edu.cuenta;


public class CuentaAhorros {
	
	protected double saldo;
	protected String numeroCuenta;
	protected double interes;	
	private double porcentajeDescuento;
	
	
	
	//Metodo para calcular el interes en la Cuenta de Ahorros
	public double calcularValorInteres() {
		this.interes= getSaldo()*10/100;
		return this.interes;
	}
	
	//Metodo para la apertura de Cuenta de Ahorros
	public void aperturaCuenta(String nombre,String apellido, double saldo) {
		
		System.out.println();
		System.out.println("La apertura de cuenta de ahorros se realiza con $100");
		setSaldo(saldo);
		
		//If-else  para controlar si se Aperturo la cuenta o no
		if(getSaldo()==100) {
			System.out.println();
			System.out.println("----------APERTURA DE CUENTA APROBADA------------");
			System.out.println("Realizando apertura de Cuenta de Ahorro para:" +nombre +" "+apellido );
			System.out.println("CALCULO DEL VALOR DE INTERES DE LA CUENTA DE:"+nombre+" "+apellido);
			calcularValorInteres();
			System.out.println("El interes de la Cuenta de Ahorros es:" +interes+ " $");	
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("----------APERTURA DE CUENTA CANCELADA------------");
			System.out.println("No se pudo aperturar su cuenta de Ahorros Sr/a:"+nombre+" "+apellido);
			System.out.println();
		}
	}	
	
	
	//Metodos Get y Set
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		
		
		if(saldo==100) {
			
			this.saldo = saldo;
		}else {
		
		}
				
		
	}
	public String getNumeroCuenta() {
		
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
			
		this.numeroCuenta = numeroCuenta;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}


	@Override
	public String toString() {
		return "CuentaAhorros [saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + ", interes=" + interes
				+ ", porcentajeDescuento=" + porcentajeDescuento + "]";
	}
	

	
	

}

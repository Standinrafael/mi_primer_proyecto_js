package com.ec.edu.cuenta;

public class CuentaCorriente extends CuentaAhorros {
	
	private double montoMinimo;
	
	
	//Metodo para calcular el Interes en la Cuenta Corriente
	public double calcularValorInteres() {
		this.interes= getSaldo()*8/100;
		return this.interes;
	}
	
	
	//Metodo para la apertura de Cuenta Corriente
	public void aperturaCuenta(String nombre,String apellido, double saldo) {
		
		System.out.println();
		System.out.println("La apertura de cuenta de ahorros se realiza con $100");
		setSaldo(saldo);
		
		//If-else  para controlar si se Aperturo la cuenta o no
		if(getSaldo()==100) {
			System.out.println();
			System.out.println("----------APERTURA DE CUENTA APROBADA------------");
			System.out.println("Realizando apertura de Cuenta Corriente para:" +nombre+" "+apellido );
			System.out.println("CALCULO DEL VALOR DE INTERES DE LA CUENTA DE:"+nombre+" "+apellido);
			calcularValorInteres();
			System.out.println("El interes de la Cuenta Corriente es:" +interes+ " $");
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("----------APERTURA DE CUENTA CANCELADA------------");
			System.out.println("No se pudo aperturar su cuenta Corriente Sr/a:"+nombre+" "+apellido);
			System.out.println();
		}
			
	}	
	
	
	//Metodo Get y Set

	public double getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}


	@Override
	public String toString() {
		return "CuentaCorriente [montoMinimo=" + montoMinimo + ", saldo=" + saldo + ", numeroCuenta=" + numeroCuenta
				+ ", interes=" + interes + "]";
	}


	

	
	
	

}

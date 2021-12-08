package com.ec.edu.cuenta;
import java.util.Random;

public class CuentaPoliza extends CuentaAhorros {
	
	//La fecha de vigencia la desgloce en dia, mes y año
	private int dia;
	private int mes;
	private int anio;
	
	
	//Metodo para calcular el interes en la Cuenta de Poliza
	public double calcularValorInteres() {
		this.interes= getSaldo()*15/100;
		return this.interes;
	}
	
	
	//Metodo para la Apertura de una Cuenta de Poliza
	public void aperturaCuenta(String nombre,String apellido, double saldo) {
		
		System.out.println();
		System.out.println("La apertura de cuenta de ahorros se realiza con $100");
		setSaldo(saldo);
		
		
		//If-else  para controlar si se Aperturo la cuenta o no
		if(getSaldo()==100) {
			
			//Mandar un numero aleatorio a ala fecha de vigencia de la cuenta 
			Random random= new Random();
			int diaVencimiento;
			int mesVencimiento;
			int anioVencimiento;
			
			diaVencimiento=random.nextInt(31)+1;
			mesVencimiento=random.nextInt(12)+1;
			anioVencimiento=random.nextInt(2040)+2020;
			
			setDia(diaVencimiento);
			setMes(mesVencimiento);
			setAnio(anioVencimiento);
			
			System.out.println();
			System.out.println("----------APERTURA DE CUENTA APROBADA------------");
			System.out.println("Realizando apertura de Cuenta de Poliza para:" +nombre+" "+apellido );
			System.out.println("CALCULO DEL VALOR DE INTERES DE LA CUENTA DE:"+nombre+" "+apellido);
			calcularValorInteres();
			System.out.println("El interes de la Cuenta de Poliza es:" +interes+ " $");		
			System.out.println();
		}
		else {
			System.out.println();
			System.out.println("----------APERTURA DE CUENTA CANCELADA------------");
			System.out.println("No se pudo aperturar su cuenta de Poliza Sr/a:"+nombre+" "+apellido);
			System.out.println();
		}
			
	}	
	
	
	//Metodos Get y Set
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}


	@Override
	public String toString() {
		return "CuentaPoliza [Fecha de Vigencia [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]  , saldo=" + saldo + ", numeroCuenta="
				+ numeroCuenta + ", interes=" + interes + "]";
	}


	
	
	

}

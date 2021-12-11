package com.ec.edu.inyeccion.dependencias.modelos;

public class CuentaCorrientee implements ICuenta {

	private float montoMinimo;
	
	@Override
	public void calcularDescuento(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Calculando corriente....");
	}

	@Override
	public void calcularBeneficio() {
		// TODO Auto-generated method stub
		System.out.println("Calculando beneficio corriente.........");
	}
	
	
	
	//Metodos GET y SET
	public float getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(float montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

	
	
}

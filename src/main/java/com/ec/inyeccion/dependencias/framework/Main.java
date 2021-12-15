package com.ec.inyeccion.dependencias.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Colocar la direccion como carpeta
		ApplicationContext app= new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");
		//Dos formas por id que esta en beans.xml o con la clase
		//nombre
		Cuenta miCuenta=(Cuenta)app.getBean("cuenta");
		System.out.println(miCuenta.getNumero());
		System.out.println(miCuenta.getSaldo());
		//clase
		//app.getBean(Cuenta.class);
		
		
		//Codigo Acoplado
/*		Cuenta miCuentaPrueba=new Cuenta();
		miCuentaPrueba.setNumero("222");
		miCuentaPrueba.setSaldo(100);
		
		Cuenta miCuentaPrueba2=new Cuenta("333",100);
		
*/		
		
		
		Cuenta miCuenta1=(Cuenta)app.getBean("cuenta1");
		System.out.println(miCuenta1.getNumero());
		System.out.println(miCuenta1.getSaldo());
		
		
		//IoC Por Constructor
		
		Estudiante estu=(Estudiante)app.getBean("estu");		
		System.out.println(estu.getNombre()+" "+estu.getApellido()+" "+estu.getEdad());
	}

}

package jorge.sanchez;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ec.inyeccion.dependencias.framework.Estudiante;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app= new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");
		
		Paciente paciente=(Paciente)app.getBean("paciente");		
		System.out.println(paciente.getNombre()+" "+paciente.getApellido()+" "+paciente.getEdad());
		
		Profesor profesor=(Profesor)app.getBean("profesor");		
		System.out.println(profesor.getNombre()+" "+profesor.getApellido()+" "+profesor.getProfesion()+" "+profesor.getUniversidad());
	}

}

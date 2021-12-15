package denis.tapia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");
	
		Paciente paci= (Paciente) app.getBean("Paciente");
		System.out.println(paci.getNombre() + " "+ paci.getApellido() + " " + paci.getEdad());
		
		Profesor profe=(Profesor) app.getBean("Profesor");
		System.out.println(profe.getNombre()+ " "+ profe.getApellido()+" "+ profe.getProfesion() + " "+profe.getUniversidad());
		
		
	}

}

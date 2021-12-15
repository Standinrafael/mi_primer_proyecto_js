package jorge.sanchez;

public class Profesor {
	private String nombre;
	private String apellido;
	private String profesion;
	private String Universidad;
	
	public Profesor() {
		
	}

	public Profesor(String nombre, String apellido, String profesion, String universidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.profesion = profesion;
		Universidad = universidad;
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

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getUniversidad() {
		return Universidad;
	}

	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}
	
	

}

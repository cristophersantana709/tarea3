package tarea3;

import java.io.Serializable;

public class Estudiantes implements Serializable {
	public String estudianteID;
	public String nombre;
	public String apellido;
	public String genero;
	public String carrera;
	public String semestre;
	public String telefono;
	public String email;
	public Estudiantes(String estudianteID, String nombre, String apellido, String genero, String carrera,
			String semestre, String telefono, String email) {
		super();
		this.estudianteID = estudianteID;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.carrera = carrera;
		this.semestre = semestre;
		this.telefono = telefono;
		this.email = email;
	}
	public Estudiantes() {
		super();
	}
	 
	public void imprimir() {
		System.out.println("EstudianteID: "+this.estudianteID);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("apellido: "+this.apellido);
		System.out.println("genero: "+this.genero);
		System.out.println("carrera: "+this.carrera);
		System.out.println("semestre: "+this.semestre);
		System.out.println("telefono: "+this.telefono);
		System.out.println("email: "+this.email);
	}	
}

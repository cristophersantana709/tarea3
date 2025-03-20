package tarea3;
import java.io.Serializable;

public class Libros implements Serializable {
	public String librosID;
	public String titulo;
	public String autor;
	public String editorial;
	public String año_publicacion;
	public String genero;
	public String numero_paginas;
	public String idioma;
	public Libros(String librosID, String titulo, String autor, String editorial, String año_publicacion, String genero,
			String numero_paginas, String idioma) {
		super();
		this.librosID = librosID;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.año_publicacion = año_publicacion;
		this.genero = genero;
		this.numero_paginas = numero_paginas;
		this.idioma = idioma;
	}
	public Libros() {
		super();
	}
	 public void imprimir () {
		 System.out.println("Libros: "+this.librosID);
		 System.out.println("Titulo: "+this.titulo);
		 System.out.println("Autor: "+this.autor);
		 System.out.println("Editorial: "+this.editorial);
		 System.out.println("Año publicacion: "+this.año_publicacion);
		 System.out.println("Genero: "+this.genero);
		 System.out.println("numero paginas: "+this.numero_paginas);
		 System.out.println("Idioma: "+this.idioma);
	 }
}

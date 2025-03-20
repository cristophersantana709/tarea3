package tarea3;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
	InicializarBases_Datos();
	MenuPrincipal();
}


public static void InicializarBases_Datos() {
	base_datos.guardarListaLibros();  new ArrayList<Libros>();
	base_datos.leerListaLibros();
}

public static void MenuPrincipal() {
	Scanner sc = new Scanner(System.in);
	int opcion=0;	
	do {
		
		System.out.println("*********************************************");
		System.out.println("**********SISTEMA DE LIBROS***********");
		System.out.println("*********************************************");
		System.out.println();
		System.out.println("************************");
		System.out.println("MENÚ DE OPCIONES");
		System.out.println("1.- Crear Libros");
		System.out.println("2.- Consultar Libros");
		System.out.println("3.- Actualizar libros");
		System.out.println("4.- Eliminar libros");
		System.out.println();
		System.out.print("Seleccione una opción:");
		opcion=sc.nextInt();
		
		switch(opcion)
		{
		case 1:
			Crearlibros();
			break;
		case 2:
			Consultarlibros();
			break;
		case 3:
			Actualizarlibros();
			break;
		case 4:
			System.out.println("Eliminaste este libro con exito!");
			break;
		
		}
		
		System.out.println("************************");
		
	}while(opcion!=4);
		
}
		
public static void Crearlibros() {
	Scanner sc = new Scanner(System.in);
	 String librosID;
	 String titulo;
	 String autor;
	 String editorial;
	 String año_publicacion;
	 String genero;
	 String numero_paginas;
	 String idioma;
	    

	
	System.out.println("*********CREACIÓN DE PERSONA********");
	System.out.print("Ingrese el libroID: ");
	librosID = sc.nextLine(); 
	sc.nextLine();
	System.out.println();
	
	System.out.print("Ingrese El titulo: ");
	titulo = sc.nextLine();
	System.out.println();
	
	System.out.print("Ingrese El autor: ");
	autor = sc.nextLine();
	sc.nextLine();
	System.out.println();
	
	System.out.print("Ingrese el editorial: ");
	editorial = sc.nextLine();
	System.out.println();
	
	System.out.print("Ingrese El año de publicacion: ");
	año_publicacion = sc.nextLine();
	System.out.println();
	
	System.out.print("Ingrese el genero: ");
	genero = sc.nextLine();
	System.out.println();
	
	System.out.print("Ingrese el numero de paginas : ");
	numero_paginas = sc.nextLine();
	System.out.println();
	
	System.out.print("Ingrese el idioma : ");
	idioma = sc.nextLine();
	System.out.println();

	if(!ExisteIdlibro(librosID)) {
		if(!ExisteNombrelibro(titulo)) {
			Libros objEstudiante= new Libros(librosID, titulo, autor,editorial, genero, año_publicacion ,numero_paginas ,idioma);
			base_datos.listalibro.add(objEstudiante);
			System.out.println("libro Ingresado con Éxito!");
			base_datos.guardarListaLibros();
			objEstudiante.imprimir();
		}
		else {
			System.out.println("El Nombre ya se encuentra Ingresado en el Sistema.");
		}
	}
	else {
		System.out.println("El Id ya se encuentra Ingresado en el Sistema.");
	}	
}

private static boolean ExisteNombrelibro(String nombre) {
	for (Libros elemento : base_datos.listalibro) {
		if (elemento.titulo.equals(nombre)) {
			return true;
		}
	}
	return false;
}

private static boolean ExisteIdlibro(String libroID) {
	for (Libros elemento : base_datos.listalibro) {
		if (elemento.librosID.equals(libroID)) {
			return true;
		}
	}
	return false;
}

public static void Consultarlibros() {
	
	for (Libros elemento : base_datos.listalibro) {
		elemento.imprimir();
	}
}

public static void Actualizarlibros() {
    Scanner sc = new Scanner(System.in);
     String librosID="";
	 String titulo="";
	 String autor="";
	 String editorial="";
	 String año_publicacion="";
	 String genero="";
	 String numero_paginas="";
	 String idioma="";
    
    System.out.println("********* MODIFICACIÓN DEl libro ********");
    System.out.print("Ingrese el ID de la persona a modificar: ");
    librosID = sc.nextLine();
    sc.nextLine();
    System.out.println();

    if (ExisteIdlibro(librosID)) {
        for (int i = 0; i < base_datos.listalibro.size(); i++) {
            if (librosID == base_datos.listalibro.get(i).librosID ){
                base_datos.listalibro.get(i).imprimir();

                System.out.print("Ingrese el nuevo libro id: ");
                librosID = sc.nextLine();
                System.out.println();

                System.out.print("Ingrese el titulo: ");
                titulo = sc.nextLine();
                sc.nextLine();
                System.out.println();

                System.out.print("Ingrese el autor: ");
                autor = sc.nextLine();
                sc.nextLine();
                System.out.println();

                System.out.print("Ingrese el nuevo genero : ");
                genero = sc.nextLine();
                sc.nextLine();
                System.out.println();
                
                System.out.print("Ingrese el editorial: ");
                editorial = sc.nextLine();
                sc.nextLine();
                System.out.println();

                System.out.print("Ingrese el año de publicacion : ");
                año_publicacion = sc.nextLine();
                sc.nextLine();
                System.out.println();

                System.out.print("Ingrese el numero de paginas  : ");
                numero_paginas = sc.nextLine();
                sc.nextLine();
                System.out.println();
                
                System.out.print("Ingrese el idioma  : ");
                idioma= sc.nextLine();
                sc.nextLine();
                System.out.println();

                base_datos.listalibro.get(i).librosID = librosID;
                base_datos.listalibro.get(i).titulo = titulo;
                base_datos.listalibro.get(i).autor = autor;
                base_datos.listalibro.get(i).genero = genero;
                base_datos.listalibro.get(i).editorial = editorial ;
                base_datos.listalibro.get(i).año_publicacion = año_publicacion;
                base_datos.listalibro.get(i).numero_paginas = numero_paginas;

                base_datos.guardarListaLibros();
                System.out.println("persona actualizado correctamente.");
                return;
            }
        }
    } else {
        System.out.println("El ID ingresado no coincide con los registros.");
    }
}


}

package tarea3;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		InicializarBases_Datos();
		MenuPrincipal();
	}
	

	public static void InicializarBases_Datos() {
		base_datos.guardarListaEstudiantes();  new ArrayList<Estudiantes>();
		base_datos.leerListaEstudiantes();
	}

	public static void MenuPrincipal() {
		Scanner sc = new Scanner(System.in);
		int opcion=0;	
		do {
			
			System.out.println("*********************************************");
			System.out.println("**********SISTEMA DE ESTUDIANTES***********");
			System.out.println("*********************************************");
			System.out.println();
			System.out.println("************************");
			System.out.println("MENÚ DE OPCIONES");
			System.out.println("1.- Crear estudiantes");
			System.out.println("2.- Consultar estudiantes");
			System.out.println("3.- Actualizar estudiantes");
			System.out.println("4.- eliminar estudiantes");
			System.out.println();
			System.out.print("Seleccione una opción:");
			opcion=sc.nextInt();
			
			switch(opcion)
			{
			case 1:
				Crearestudiantes();
				break;
			case 2:
				Consultarestudiantes();
				break;
			case 3:
				Actualizarestudiantes();
				break;
			case 4:
				System.out.println("eliministe este libro!");
				break;
			
			}
			
			System.out.println("************************");
			
		}while(opcion!=4);
			
	}
			
	public static void Crearestudiantes() {
		Scanner sc = new Scanner(System.in);
		 String estudianteID ="";
		 String nombre="";
		 String apellido="";
		 String genero="";
		 String carrera="";
		 String semestre="";
		 String telefono="";
		 String email="";
		    
		System.out.println("*********CREACIÓN DE ESTUDIANTES********");
		System.out.print("Ingrese El estudianteID: ");
		estudianteID = sc.nextLine(); 
		sc.nextLine();
		System.out.println();
		
		System.out.print("Ingrese El Nombres: ");
		nombre = sc.nextLine();
		System.out.println();
		
		System.out.print("Ingrese El apellidos: ");
		apellido = sc.nextLine();
		sc.nextLine();
		System.out.println();
		
		System.out.print("Ingrese el genero: ");
		genero = sc.nextLine();
		System.out.println();
		
		System.out.print("Ingrese La carrera: ");
		carrera = sc.nextLine();
		System.out.println();
		
		System.out.print("Ingrese el semestre: ");
		semestre = sc.nextLine();
		System.out.println();
		
		System.out.print("Ingrese El telefono : ");
		telefono = sc.nextLine();
		System.out.println();

		System.out.print("Ingrese El email : ");
		email = sc.nextLine();
		System.out.println();
		
		if(!ExisteIdestudiantes(estudianteID)) {
			if(!ExisteNombreestudiante(nombre)) {
				Estudiantes objEstudiante= new Estudiantes(estudianteID, nombre, apellido, carrera, genero, telefono ,semestre, email);
				base_datos.listaEstudiantes.add(objEstudiante);
				System.out.println("estudiantes Ingresado con Éxito!");
				base_datos.guardarListaEstudiantes();
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

	private static boolean ExisteNombreestudiante(String nombres) {
		for (Estudiantes elemento : base_datos.listaEstudiantes) {
			if (elemento.nombre.equals(nombres)) {
				return true;
			}
		}
		return false;
	}

	private static boolean ExisteIdestudiantes(String estudiantesID) {
		for (Estudiantes elemento : base_datos.listaEstudiantes) {
			if (elemento.nombre.equals(estudiantesID)) {
				return true;
			}
		}
		return false;
	}
	
	public static void Consultarestudiantes() {
		
		for (Estudiantes elemento : base_datos.listaEstudiantes) {
			elemento.imprimir();
		}
	}
	
	public static void Actualizarestudiantes() {
	    Scanner sc = new Scanner(System.in);
	    String estudianteID ="";
		 String nombre="";
		 String apellido="";
		 String genero="";
		 String carrera="";
		 String semestre="";
		 String telefono="";
		 String email="";
	    
	    System.out.println("********* MODIFICACIÓN DE LA PERSONA ********");
	    System.out.print("Ingrese el ID de la persona a modificar: ");
	    estudianteID = sc.nextLine();
	    sc.nextLine();
	    System.out.println();

	    if (ExisteIdestudiantes(estudianteID)) {
	        for (int i = 0; i < base_datos.listaEstudiantes.size(); i++) {
	            if (estudianteID == base_datos.listaEstudiantes.get(i).estudianteID ){
	                base_datos.listaEstudiantes.get(i).imprimir();

	                System.out.print("Ingrese el nuevo estudianteID: ");
	                estudianteID = sc.nextLine();
	                System.out.println();

	                System.out.print("Ingrese la nueva nombres: ");
	                nombre = sc.nextLine();
	                sc.nextLine();
	                System.out.println();

	                System.out.print("Ingrese el nuevo apellidos: ");
	                apellido = sc.nextLine();
	                sc.nextLine();
	                System.out.println();

	                System.out.print("Ingrese la nueva genero : ");
	                genero = sc.nextLine();
	                sc.nextLine();
	                System.out.println();
	                
	                System.out.print("Ingrese la nueva carrera: ");
	                carrera = sc.nextLine();
	                sc.nextLine();
	                System.out.println();

	                System.out.print("Ingrese el nuevo semestre : ");
	                semestre = sc.nextLine();
	                sc.nextLine();
	                System.out.println();

	                System.out.print("Ingrese la nueva telefono  : ");
	                telefono = sc.nextLine();
	                sc.nextLine();
	                System.out.println();
	                
	                System.out.print("Ingrese la nueva email : ");
	                email = sc.nextLine();
	                sc.nextLine();
	                System.out.println();

	                base_datos.listaEstudiantes.get(i).estudianteID = estudianteID;
	                base_datos.listaEstudiantes.get(i).nombre = nombre;
	                base_datos.listaEstudiantes.get(i).apellido = apellido;
	                base_datos.listaEstudiantes.get(i).genero = genero;
	                base_datos.listaEstudiantes.get(i).carrera = carrera ;
	                base_datos.listaEstudiantes.get(i).telefono = telefono ;
	                base_datos.listaEstudiantes.get(i).semestre = semestre;
	                base_datos.listaEstudiantes.get(i).email = email;
	                
	                base_datos.guardarListaEstudiantes();
	                System.out.println("persona actualizado correctamente.");
	                return;
	            }
	        }
	    } else {
	        System.out.println("El ID ingresado no coincide con los registros.");
	    }
	}



}

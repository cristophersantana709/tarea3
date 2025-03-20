package tarea3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
public class base_datos {
public static List<Estudiantes> listaEstudiantes;
	
	public static void guardarListaEstudiantes() {
		String  nombreArchivo="C:\\BaseDatosISTLC\\Archestudiantes";
		try(ObjectOutputStream salida = new ObjectOutputStream( new FileOutputStream(nombreArchivo))){
		salida.writeObject(base_datos.listaEstudiantes);
		System.out.println("Producto Grabado con Éxito!");
			
		} catch (IOException e) {
			System.out.println("Ocurrió un error al grabar el producto! ");
		}
	
	}
	
	public static void leerListaEstudiantes() {
		String  nombreArchivo="C:\\BaseDatosISTLC\\ArchEstudiantes";
		try  (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
			base_datos.listaEstudiantes= (ArrayList<Estudiantes>) entrada.readObject();
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Ocurrió un error al leer el producto! ");
		}
	
	}
public static List<Libros> listalibro;

public static void guardarListaLibros() {
	String  nombreArchivo="C:\\BaseDatosISTLC\\ArchLibros";
	try(ObjectOutputStream salida = new ObjectOutputStream( new FileOutputStream(nombreArchivo))){
	salida.writeObject(base_datos.listalibro);
	System.out.println("Producto Grabado con Éxito!");
		
	} 
	catch (IOException e) {
		System.out.println("Ocurrió un error al grabar el producto! ");
		}

}

public static void leerListaLibros() {
	String  nombreArchivo="C:\\BaseDatosISTLC\\ArchEstudiantes";
	try  (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
		base_datos.listalibro=(ArrayList<Libros>) entrada.readObject();
		
	} catch (IOException | ClassNotFoundException e) {
		System.out.println("Ocurrió un error al leer el producto! ");
}
}
}


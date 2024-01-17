package alexis.practica1;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Practica1_2 {

	/*
	 * . Desarrolla un programa en Java que, utilizando el objeto URLconnetion y
	 * OutStream de respuesta a un formulario html. Se deberá rellenar al menos dos
	 * etiquetas input. El formulario html, puede ser un formulario de desarrollo
	 * propio, ejecutado en tu propio host (aunque no es obligatorio).
	 * 
	 */
	
	
	//NO SOPORTA OUTPUT? MAL REDACTADO EL EJERCICIO? SOYT UN MONKEY?
	
	public static void main(String[] args) {

		try {
			// Ruta local al archivo HTML
			String rutaLocal = "file:///C:/Users/As1ss/Desktop/COSAS%20CLASE%20KEK/DAM2T/PS/JAVA/Practica1/Formulario.html";

			// Crear URL
			URL url = new URL(rutaLocal);

			// Instanciamos un objeto de tipo HttpURLConnection para obtener la conexion al
			// documento html
			URLConnection connection = url.openConnection();
			
			
			//Aqui establecemos el metodo para compartir los datos con el formulario
		
			connection.setDoOutput(true);

			// Instanciamos un OutputStream para poder tener una comunicacion de salida de
			// datos con el documento html
			OutputStream os = connection.getOutputStream();

			// Insantiamos un BufferedWriter para poder enviar un conjunto de caracteres
			// almacenados en el buffer
			BufferedWriter br = new BufferedWriter(new OutputStreamWriter(os));

			// Instanciamos un objeto scanner para recibir inputs del usuario
			// (nombre,apellido)
			Scanner sc = new Scanner(System.in);

			//Recogemos los inputs del usuario
			System.out.println("Escribe su nombre por favor");
			
			//Aqui añadimos nombre= porque asi le comunicamos por clave valor el nombre a la etiqueta correspondiente
			String nombre ="nombre="+ sc.nextLine(); 
			System.out.println("Escriba su apellido por favor");
			
			//Aqui añadimos apellido= porque asi le comunicamos por clave valor el apellido a la etiqueta correspondiente
			String apellido ="&apellido="+ sc.nextLine();
			
			
			br.write(nombre);
			br.write(apellido);
			
			br.close();
			
		
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

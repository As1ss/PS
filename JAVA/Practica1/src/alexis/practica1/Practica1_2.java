package alexis.practica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
	 
			Scanner sc = new Scanner(System.in);
	 
			  String rutaLocal = "file:///D://DAM2T//PS//JAVA//Practica1//Formulario.html";
			//Cambiar la direccion a la actual del fichero
			URL url;
			String etiqueta;
			URLConnection conn;
			InputStream is = null;
			BufferedReader br;
			/*
			 * QUEDA HACER QUE LOS INPUT DEL USUARIO SE MUESTREN DENTRO DE LAS ETIQUETAS NOMBRE Y APELLIDOS :S
			 */
			try {
				url = new URL(rutaLocal);
				
				conn = url.openConnection();
				is = conn.getInputStream();
				br = new BufferedReader(new InputStreamReader(is));
				String linea;
				while ((linea=br.readLine()) != null) {
					
						System.out.println(linea);
					

					
				}

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
			}
	
	 
		}
}

	 
	

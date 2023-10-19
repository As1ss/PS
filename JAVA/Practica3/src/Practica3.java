import java.io.BufferedReader;

import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Practica3 {

	static Process p;
	static BufferedReader reader;
	static PrintWriter writer;
	static String commando;

	public static void main(String[] args) {

		//Guardamos el comando que vamos a ejecutar para guardar el resultado en un fichero
		commando = "tasklist /svc /fi \"imagename eq svchost.exe\"";

		//Try catch para controlar las excepciones
		
		try {
			//Inicializamos el printwritter creando dentro de el un fileoutput para guardar
			//el resultado de la ejecucion del comando
			
			writer = new PrintWriter(new FileOutputStream("SVCHOST.TXT"));
			//Ejecutamos el comando y obtenemos el proceso
			
			p = Runtime.getRuntime().exec(commando);
			
			//Inicializamos un reader para leer todas las lineas del resultado
			
			reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line;

			while ((line = reader.readLine()) != null) {
				// Escribe el resultado linea por linea hasta que sea nula en el fichero creado
				writer.print(line);

			}
			
			//Cerramos los readers y los writers
			reader.close();
			writer.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Se ha originado un error");
		}

	}

}

package alexis.practica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

class Practica1_1 {
	/*
	 * 1. Realizar un programa Java que acepte dos parámetros de entrada: a. Una URL
	 * que corresponda a un documento HTML b. Una etiqueta HTML Como resultado, el
	 * programa debe sacar por la salida estándar todas las líneas que contengan esa
	 * etiqueta.
	 */
	
	
	public static void main(String[] args) throws IOException {
		
		if(args.length<2) {
			System.out.println("Por favor introduzca los dos parámetros");
		}
		else{
			URL url;
			String etiqueta;
			URLConnection conn;
			InputStream is = null;
			BufferedReader br;
			
			try {
				url = new URL(args[0]);
				etiqueta = "<"+args[1];
				conn = url.openConnection();
				is = conn.getInputStream();
				br = new BufferedReader(new InputStreamReader(is));
				
			

				String linea;
				while ((linea=br.readLine()) != null) {
					if(linea.contains(etiqueta)) {
						System.out.println(linea);
					}

					
				}

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				is.close();
				
				
			}
		}
		

	}

}

package EjemploHilos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ProcesosEjemplo {

	public static void main(String[] args) throws IOException {
		File fich = new File("SVCHOST.txt");
		fich.createNewFile();
		String comando= "tasklist /svc /fi \"imagename eq svchost.exe\"";
		Runtime r = Runtime.getRuntime();
		Process p = r.exec(comando);
		InputStream is = p.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		PrintWriter writer = new PrintWriter(new FileOutputStream(fich));
		String linea;
		
		while ((linea = reader.readLine())!=null) {
			writer.print(linea);
		}
		reader.close();
		writer.close();
		

	}

}

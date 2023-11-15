package EjemploHilos;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;

public class EjemploHilos {

	
	public static void main(String[] args) {
	Runtime r = Runtime.getRuntime();
	String comando = "NOTEPAD";
	Process p ;

	try {
		p = r.exec(comando);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}

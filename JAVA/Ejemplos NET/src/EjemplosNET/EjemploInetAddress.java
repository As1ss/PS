package EjemplosNET;
import java.net.*;

public class EjemploInetAddress {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress dir = InetAddress.getByName("amazon.com");
		InetAddress localDir = InetAddress.getLocalHost();
		InetAddress[] direcionesLocales =InetAddress.getAllByName("IF05");
		
	
		System.out.println("-------------------amazon.com-----------------------");
		System.out.println("Direccion de localhost :"+dir.getHostAddress());
		System.out.println("Nombre del dominio : "+dir.getHostName());
		System.out.println("Nombre del dominio completo : "+dir.getCanonicalHostName());
		System.out.println();
		
		System.out.println("-------------------LOCALHOST------------------------");
		System.out.println("Direccion del host :"+localDir.getHostAddress());
		System.out.println("Nombre del dominio : "+localDir.getHostName());
		System.out.println("Nombre del dominio completo : "+localDir.getCanonicalHostName());
		System.out.println();
		
		System.out.println("------------------------PC LOCAL------------------------------");
		for (InetAddress ip: direcionesLocales) {
			System.out.println("DIRECCIONES DEL HOST: "+ip);
			System.out.println("Nombre del dominio : "+ip.getHostName());
			System.out.println("Nombre del dominio completo : "+ip.getCanonicalHostName());
			System.out.println();
		}
		
		

	}

}

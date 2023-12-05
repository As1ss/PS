package EjemplosNET;
import java.net.*;

public class EjemploInetAddress {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress dir = InetAddress.getByName("localhost");
		InetAddress localDir = InetAddress.getLocalHost();
		InetAddress[] direcionesLocales =InetAddress.getAllByName("IF05");
		
	
		System.out.println("Direccion de localhost :"+dir.getHostAddress());
		System.out.println("Nombre de la direccion : "+dir.getHostName());
		System.out.println("Nombre de la direccion : "+dir.getCanonicalHostName());
		System.out.println();
		
		System.out.println("Direccion del host :"+localDir.getHostAddress());
		System.out.println("Nombre de la direccion : "+localDir.getHostName());
		System.out.println("Nombre de la direccion : "+localDir.getCanonicalHostName());
		System.out.println();
		for (InetAddress ip: direcionesLocales) {
			System.out.println("Direcciones del host: "+ip);
			System.out.println("Nombre de la direccion : "+ip.getHostName());
			System.out.println("Nombre de la direccion : "+ip.getCanonicalHostName());
			System.out.println();
		}
		
		

	}

}

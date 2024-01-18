package ejercicios;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		
		
		try {
			Persona p = new Persona("Alexis Top G",21);
			InetAddress ip = InetAddress.getLocalHost();
			byte[] longitud= new byte[999999999];
			
		
			ByteArrayOutputStream bar = new ByteArrayOutputStream();
			ObjectOutputStream os = new ObjectOutputStream(bar);
			os.writeObject(p);
			
			byte [] data = bar.toByteArray();
			
			
			
		
			
		
			DatagramSocket socket = new DatagramSocket();
			
			InetAddress ipPayaso = InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,33,65});
			
			//192.168.33.65
			DatagramPacket dgp = new DatagramPacket(data,data.length,ipPayaso,55555);
			
		
				socket.send(dgp);	
	
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	

}


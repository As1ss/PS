package ejercicios;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Ejercicio1 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getLocalHost();
			String ipString = ip.getHostAddress();
			String dataString = "Alexis top G\n"+ipString;
			
			
			byte[] data =  dataString.getBytes();
		
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

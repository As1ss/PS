package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		 try {
	            // Crear un servidor enlazado al puerto 9000
	            ServerSocket serverSocket = new ServerSocket(9000);
	            
	            System.out.println("Servidor esperando conexiones en el puerto 9000...");

	            // Esperar a que un cliente se conecte
	            Socket clientSocket = serverSocket.accept();
	            System.out.println("Cliente conectado desde: " + clientSocket.getInetAddress());

	            // Crear flujos de entrada/salida para comunicarse con el cliente
	            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

	            // Leer la cadena enviada por el cliente
	            String mensajeCliente = in.readLine();
	            System.out.println("Mensaje recibido del cliente: " + mensajeCliente);

	            // Responder al cliente
	            out.println("Hasta pronto puto payaso de los cojones.");

	            // Cerrar conexiones
	            in.close();
	            out.close();
	            clientSocket.close();
	            serverSocket.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}

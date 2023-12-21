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
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) {
		 try {
	            // Crear un servidor enlazado al puerto 9000
	            ServerSocket serverSocket = new ServerSocket(9000);
	            
	            System.out.println("Servidor esperando conexiones en el puerto 9000...");

	            // Esperar a que un cliente se conecte
	            Socket clientSocket = serverSocket.accept();
	            System.out.println("Cliente conectado desde: " + clientSocket.getInetAddress());

	          
	            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
	            
	            Runnable hablar = new Runnable() {
					
					@Override
					public void run() {
						Scanner sc =new Scanner(System.in);
						
						
						while(true) {
							String mensajeYo = sc.nextLine();
							  // Responder al cliente
				            out.println(mensajeYo);
				            
				            if (mensajeYo.equalsIgnoreCase("salir")) {
				            	break;
				            }
						}
					   
						
						
					}
				};
				
				Thread servidor = new Thread(hablar);
				
				servidor.start();

				Runnable recibirMensaje = new Runnable() {
					
					@Override
					public void run() {
						  // Crear flujos de entrada/salida para comunicarse con el cliente
			          
			            
			            try {
			            	  BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			            	 while(true) {
							    	
					                // Leer la cadena enviada por el cliente
						            String mensajeCliente = in.readLine();
						            
						            System.out.println("Mensaje recibido del cliente: " + mensajeCliente);
						            if(mensajeCliente.equalsIgnoreCase("salir")) {
						            	  break;
						            }
						          
					            }
			            	// in.close();
						} catch (Exception e) {
							
						}
						
					   
					    
						
					}
				};
	        
				Thread cliente = new Thread(recibirMensaje);
				cliente.start();

	       

	            
	            // Cerrar conexiones
	        
				
				
	            out.close();
	            clientSocket.close();
	            serverSocket.close();
	           
	            

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}

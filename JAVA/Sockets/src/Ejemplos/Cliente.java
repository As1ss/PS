package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) {
		try {
			// Conectar al servidor en la IP y puerto especificados
			Socket socket = new Socket("127.168.33.71", 9000);

			// Crear flujos de entrada/salida para comunicarse con el servidor
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

			// Enviar un mensaje al servidor desde el telnet
			out.println("Hola, servidor");

			// Leer la respuesta del servidor
			String respuestaServidor = in.readLine();
			System.out.println("Respuesta del servidor: " + respuestaServidor);

			// Cerrar conexiones
			in.close();
			out.close();
			socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

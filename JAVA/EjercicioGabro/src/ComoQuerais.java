
import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;

public class ComoQuerais {

	private static String user;
	private static String server;
	private static String password;
	private static int puerto;
	private static FTPClient ftpClient;

	public static void main(String[] args) throws IOException {

		server = "192.168.33.65";
		puerto = 21;
		user = "Alumno";
		password = "123";


		try {
			ftpClient = new FTPClient();
			ftpClient.connect(server, puerto);

			if (ftpClient.isConnected()) {
				System.out.println("Se ha conectado correctamente");
			}
			else {
				System.out.println("No se ha podido conectar al servidor");
			}
			
			ftpClient.login(user, password);
			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			
			String rutaRemota = "angrydev.jpg";
			
			String rutaLocal ="D:\\angrydev.jpg";
			
			File archivo = new File(rutaLocal);
			
			FileInputStream ifs = new FileInputStream(archivo);
			
			
			
			
			if (ftpClient.storeFile(rutaRemota, ifs)) {
				
				System.out.println("Se ha realizado la transferencia");
			}
			else {
				System.out.println("No se ha realizado la transferencia");
				
			}
			
			ifs.close();
			ftpClient.logout();
			

		} catch (SocketException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}finally {
		
			
		}

	}

	public String getDatos() {
		return user;
	}

	public void setDatos(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}

}

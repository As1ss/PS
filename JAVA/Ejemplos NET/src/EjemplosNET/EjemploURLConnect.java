package EjemplosNET;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class EjemploURLConnect {

	public static void main(String[] args) throws URISyntaxException, IOException {

		URL urlAddress = new URI("https://www.casasrurales.net").toURL();
		
		URLConnection connector = urlAddress.openConnection();
		InputStream is = connector.getInputStream();
		
		int i ;
		
		while((i=is.read())!=-1) {
			
			System.out.print((char)i);
		}
	

	}

}

package EjemplosNET;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class EjemploURL {

	public static void main(String[] args) throws URISyntaxException, IOException {
		
		URL urlAddress = new URI("https://www.lamaravillosaorquestadelalcohol.com").toURL();
		InputStream is = urlAddress.openStream();
		
		int i;
		
		
		while((i=is.read())!=-1){
			System.out.print((char)i);
		}
		
	}

}

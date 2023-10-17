
public class EjemploHilos {

	static Runtime r;
	static Process p;
	public static void main(String[] args) {
		r = Runtime.getRuntime();
		
		try {
			p = r.exec("NOTEPAD");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

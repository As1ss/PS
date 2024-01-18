package ejercicios;

import java.io.Serializable;

public class Persona implements Serializable {
	private String nombre;
	private int edad ;
	
	public Persona() {
	
	}

	public Persona(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	

}

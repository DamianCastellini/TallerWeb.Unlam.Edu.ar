package ar.edu.unlam.tallerweb.bardehomero;
/*
 * Persona va a poseer un nombre
 */
public class Persona {
	
	private String nombre;
	
	public Persona(String nombre){
		this.nombre = nombre;

	}
	public String getNombre(){
		return this.nombre;
	}

}

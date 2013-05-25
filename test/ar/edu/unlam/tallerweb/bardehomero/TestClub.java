package ar.edu.unlam.tallerweb.bardehomero;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestClub {
    @Test
	public void queEntreUnaPersona(){
    	Persona Diego = new Persona("Diego");
    	Club cocodrilo = new Club();
    	cocodrilo.entrarAlClub(Diego);
        /*
         *  Correcto
         */
    	assertEquals("Entro una persona",1,cocodrilo.getCantidad());
    	/*
    	 * Incorrecto
    	 */
    	assertEquals("Entro una persona",2,cocodrilo.getCantidad());
		

	}

    @Test
	public void queEntrenDosPersonasDelMismoNombre(){
    	Persona Diego = new Persona("Diego");
    	Persona Maradona = new Persona("Diego");
    	Club cocodrilo = new Club();
    	cocodrilo.entrarAlClub(Diego);
    	cocodrilo.entrarAlClub(Maradona);
    	/*
    	 * Correcto
    	 */
    	assertEquals("Entraron dos personas",1,cocodrilo.getCantidad());
    	/*
    	 * Incorrecto
    	 */
     	assertEquals("Entraron dos personas",2,cocodrilo.getCantidad());
		
	 }

     @Test
	  public void queEntrenTresPersonas(){
    	Persona Diego = new Persona("Diego");
    	Persona Alberto = new Persona("Alberto");
    	Persona Damian = new Persona("Damian");
    	Club cocodrilo = new Club();
    	cocodrilo.entrarAlClub(Diego);
    	cocodrilo.entrarAlClub(Alberto);
    	cocodrilo.entrarAlClub(Damian);
    	/*
    	 * Correcto
    	 */
    	assertEquals("Entraron 3 personas",3,cocodrilo.getCantidad());
    	/*
    	 * Incorrecto
    	 */
    	assertEquals("Entraron 3 personas",0,cocodrilo.getCantidad());
	}

}

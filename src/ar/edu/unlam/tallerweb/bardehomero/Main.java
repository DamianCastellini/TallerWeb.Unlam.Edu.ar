package ar.edu.unlam.tallerweb.bardehomero;

public class Main {

	/**
	 * @param args
	 * @Test
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Instancio el club
		 */
		Club cocodrilo = new Club();
		/*
		 * Instancio las personas
		 */
		Persona Diego = new Persona("Diego");
		Persona Damian = new Persona ("Damian");
		Persona Ruben = new Persona ("Ruben");
		Persona Matias = new Persona ("Matias");
		Persona Alberto = new Persona ("Beto");
		/*
		 * Las ingreso al club
		 */
		cocodrilo.entrarAlClub(Ruben);
		cocodrilo.entrarAlClub(Diego);
		cocodrilo.entrarAlClub(Alberto);
		cocodrilo.entrarAlClub(Matias);
		cocodrilo.entrarAlClub(Damian);
		/*
		 * Solicito el nombre de las personas ingresadas ordeanadas de menor a mayor
		 */
		cocodrilo.mostrarPersonasOrdenadas();
		/*
		 * Imprimo la cantidad de personas dentro del club
		 */
		System.out.println("Cantidad de personas: "+ cocodrilo.getCantidad());
		

	}

}

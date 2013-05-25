package ar.edu.unlam.tallerweb.bardehomero;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;



/*
 * Club al que ingresan personas, pero dentro del mismo no pueden haber dos personas con el mismo nombre
 */
public class Club {

	SortedSet<Persona> personas;
	
	/*
	 * El comparador va a indicarle al SortedSet de que forma va a comparar, en este caso nombre vs nombre 
	 */
	Comparator<Persona> comparador = new Comparator<Persona>() {

		@Override
		public int compare(Persona persona1, Persona persona2) {

			String nombre1 = persona1.getNombre().toUpperCase();
			String nombre2 = persona2.getNombre().toUpperCase();
			
			return nombre1.compareTo(nombre2);
		}
	};
	
	public Club(){
		personas = new TreeSet<Persona>(comparador);
	}
	/*
	 *  Ingresa la persona al club sólo si, dentro del mismo no existe otra con el mismo nombre
	 */
	public void entrarAlClub(Persona persona){
		
		this.personas.add(persona);
	}
	/*
	 *  En cualquier momento se puede solicitar que el club nos muestre las personas que están dentro ordenadas alfabeticamente por nombre
	 */
	public void mostrarPersonasOrdenadas(){
		for(Persona miembro: personas){
			System.out.println(miembro.getNombre());
		}
		
	}
    /*
     *  Cantidad de personas en el club en determinado momento
     */
	public int getCantidad(){
		return this.personas.size();
	}
}

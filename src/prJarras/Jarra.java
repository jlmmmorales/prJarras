package prJarras;
/**
 * En esta clase "simulamos" el uso de una jarra de agua. Suponemos que
 * disponemos de una fuente y un sumidero de tal manera que podemos llenar la
 * jarra (entera) y vaciarla (entera tambien). Otra operacion permitida es
 * llenar una jarra con el agua que haya en otra jarra (sin que llegue a
 * rebosar).
 * @author POO
 */

public class Jarra {
	/**
	 * Contenido de liquido (en litros) de la jarra.
	 */
	private int contenido;

	/**
	 * Capacidad de la jarra (en litros).
	 */
	private final int capacidad;

	/**
	 * Creamos una jarra a partir de su capacidad.
	 * 
	 * @param capacidadInicial   capacidad que va a tener la jarra.
	 */
	public Jarra(int capacidad) {
		if(capacidad <= 0){
			throw new JarraCapacidadException("ERROR - JarraCapacidadException");
		}
		this.capacidad = capacidad;
		contenido = 0;
	}

	/**
	 * Devolvemos la capacidad de la jarra.
	 * 
	 * @return int con la capacidad de la jarra.
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * Devolvemos la cantidad de líquido que hay en la jarra.
	 * 
	 * @return int con la cantidad de líquido que hay en la jarra.
	 */
	public int getContenido() {
		return contenido;
	}

	/**
	 * Llenamos por completo la jarra.
	 */
	public void llenar() {
		contenido = capacidad;
	}

	/**
	 * Vaciamos por completo la jarra.
	 */
	public void vaciar() {
		contenido = 0;
	}

	/**
	 * Metodo para volcar el contenido de una jarra en otra hasta que 
	 * se llene o se vacie la otra
	 * @param j Jarra de la que se extrae el agua
	 */
	public void llenarDesde(Jarra j) {		
		if (this.capacidad-this.contenido >= j.contenido){ //cabe todo en la jarra receptora
			this.contenido += j.contenido;  //la jarra receptora se llena completamente.
			j.contenido = 0; 			    //La jarra origen se vacía completamente
		}else{//no cabe todo
			j.contenido -= (this.capacidad - this.contenido); //la jarra origen solo vierta la parte 
															 //de su contenido que cabía en la jarra receptora
			this.contenido = this.capacidad; //la jarra receptora está llena
		}
		
	}

	/**
	 * Representamos una jarra indicando contenido y capacidad.
	 */
	@Override
	public String toString() {
		return "Jarra(" + capacidad + ", " + contenido + ")";
	}
}

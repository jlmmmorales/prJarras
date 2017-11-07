import javax.sound.midi.SysexMessage;

import prJarras.Jarra;
import prJarras.JarraCapacidadException;

/**
 * Clase de prueba para Jarras
 *
 * 
 */
public class TestJarrasVariables {

	public static void main(String[] args) {
		
	try{
		Jarra jarraA = new Jarra(Integer.parseInt(args[0]));
		Jarra jarraB = new Jarra(Integer.parseInt(args[1]));
	
		System.out.println("Ambas jarras están vacias");
		System.out.println("jarra A: " + jarraA);
		System.out.println("jarra B: " + jarraB);
		jarraA.llenar();
		System.out.println("Lleno la jarra A");
		System.out.println("jarra A: " + jarraA);
		System.out.println("jarra B: " + jarraB);
		jarraB.llenarDesde(jarraA);
		System.out.println("Lleno la jarra B con la jarra A");
		System.out.println("jarra A: " + jarraA);
		System.out.println("jarra B: " + jarraB);
		jarraB.vaciar();
		System.out.println("Vacío la jarra B");
		System.out.println("jarra A: " + jarraA);
		System.out.println("jarra B: " + jarraB);
		System.out.println("Lleno la jarraB con la jarra A");
		jarraB.llenarDesde(jarraA);
		System.out.println("jarra A: " + jarraA);
		System.out.println("jarra B: " + jarraB);
		
	}catch (ArrayIndexOutOfBoundsException e){
		System.err.println("ERROR: Use TestJarrasVariables capacidadJarra1 capacidadJarra2.");
	}catch (NumberFormatException e){
		System.err.println("ERROR: Algún parámetro no es un número.");
	}catch (JarraCapacidadException e){
		System.err.println("ERROR: La capacidad de las jarras debe ser mayor que 0.");
	}
		
  }

}

import prJarras.Jarra;

/**
 * Clase de prueba para Jarras
 *
 * 
 */
public class TestJarras {

	public static void main(String[] args) {
		Jarra jarraA = new Jarra(7);
		Jarra jarraB = new Jarra(4);
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
		
	}

}

package fernando;
import fernando.Cajero;
import fernando.Cliente;
/**
 *
 * @author fernando
 */
public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Eddy", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Gabriel", new int[] { 1, 3, 5, 1, 1 });
                Cliente cliente3 = new Cliente("Renato", new int[] { 1, 3, 5, 1, 1 });
                Cliente cliente4 = new Cliente("David", new int[] { 1, 3, 5, 1, 1 });
                Cliente cliente5 = new Cliente("Pedro", new int[] { 1, 3, 5, 1, 1 });

		Cajero cajerO1 = new Cajero("Cajero Fernando");
		Cajero cajerO2 = new Cajero("Cajero Juan");
                Cajero cajerO3 = new Cajero("Cajero Carlos");
                Cajero cajerO4 = new Cajero("Cajero Edison");
                Cajero cajerO5 = new Cajero("Cajero Edi");

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();

		cajerO1.procesarCompra(cliente1, initialTime);
		cajerO2.procesarCompra(cliente2, initialTime);
	}

}


public class TestaFor {

	public static void main(String[] args) {
		

		for (int contador = 0; contador <= 10; contador++) {
			System.out.print(" " + contador + " |");

		}
		//contador só está no escopo do for
		//System.out.println("\n" + contador + " último número, não entra no loop de novo");
	}

}

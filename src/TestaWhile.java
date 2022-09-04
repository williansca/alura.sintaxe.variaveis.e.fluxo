
public class TestaWhile {

	public static void main(String[] args) {

		//tem que declarar e inicializar a variavel para usar
		int contador = 0;
		
		while (contador <= 10) {
			System.out.print(" " + contador + " |");
			contador++;
		}
		
		System.out.println("\n" + contador + " último número, não entra no loop de novo");
	}

}


public class TestaTabuada {
	
	public static void main(String[] args) {
		
		for (int multiplicador = 1; multiplicador < 10; multiplicador++) {
			for (int contador = 0; contador <= 10; contador++) {
				//System.out.println(multiplicador);
				//System.out.println(contador);
				System.out.print("|" + multiplicador + " * " + contador + " = " + multiplicador * contador + "|");
				System.out.print(" ");
			}
			System.out.println();
			System.out.println();
		}
	}
}


public class ProgramaMultiplosTres {
	
	public static void main(String[] args) {
		System.out.println("Multiplos de 3 até 30");
		for (int numero = 1; numero <= 30; numero++) {
			if (numero % 3 == 0) {
				System.out.println(numero);
			}
		}
		
		System.out.println();
		
		System.out.println("Multiplos de 3 até 30");
		for (int i = 3; i <= 30; i += 3) {
			System.out.println(i);
		}
	}

}

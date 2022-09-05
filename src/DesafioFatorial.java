
public class DesafioFatorial {

	public static void main(String[] args) {

		int n = 1;

		for (int i = 1; i < 11; i++) {

			n = n * i;

			System.out.println("Fatorial de " + i + " = " + n);

		}

		System.out.println();
		System.out.println();

		int numero = 1;
		int fatorial = 1;

		// numero entra com o 1 e adiciona +1 a cada loop
		while (numero < 10) {
			// numero que entra multiplica numero pelo fatorial atual e armazena em fatorial
			fatorial *= numero;
			System.out.println(numero + "! = " + fatorial);
			numero++;
		}

	}
}
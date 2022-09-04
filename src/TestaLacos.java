
public class TestaLacos {

	public static void main(String[] args) {

		for (int linha2 = 0; linha2 < 10; linha2++) {

			for (int coluna2 = 0; coluna2 < 10; coluna2++) {

				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for (int linha = 0; linha < 10; linha++) {

			for (int coluna = 0; coluna < 10; coluna++) {

				if (coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for (int linha3 = 0; linha3 <= 10; linha3++) {

			for (int coluna3 = 10; coluna3 >= 1; coluna3--) {

				if (coluna3 < linha3) {
					break;
				}

				System.out.print("*");
			}
			System.out.println();
		}

	}

}

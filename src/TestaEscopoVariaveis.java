
public class TestaEscopoVariaveis {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadePessoas = 2;
		// boolean acompanhado = quantidadePessoas >= 2;

		boolean acompanhado = false;

		if (idade >= 18 || acompanhado) {
			System.out.println("\nMaior de idade ou acompanhado. Pode entrar.");
		} else {
			System.out.println("\nVocê é menor de idade. Não pode entrar.");
		}
		System.out.println(idade + " anos");

		boolean foiPromovido = true;

		if (foiPromovido) {
			double salario = 4200.0;
		} else {
			double salario = 3800.0;
		}

		/*
		 * O código nem compila, pois fora do bloco if/else a variável salario não
		 * existe mais. a variável salario só é visível dentro do bloco if/else.
		 *
		 * System.out.println(salario);
		 */
	}

}

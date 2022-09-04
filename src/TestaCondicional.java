
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 3;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("\nMaior de idade. Pode entrar.");
			System.out.println(idade + " anos");
		} else {
			if (quantidadePessoas > 2) {
				System.out.println("Menor de idade mas acompanhado, pode entrar.");
			} else {
				System.out.println("\nVocê é menor de idade. Não pode entrar.");
			}
		}

	}
}

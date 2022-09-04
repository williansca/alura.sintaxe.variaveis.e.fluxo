
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 || acompanhado) {
			System.out.println("\nMaior de idade ou acompanhado. Pode entrar.");
		} else {
			System.out.println("\nVocê é menor de idade. Não pode entrar.");
		}
		System.out.println(idade + " anos");
	}

}

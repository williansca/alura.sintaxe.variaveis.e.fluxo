
public class ExercicioTestaCaracteres {
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);

		// guarda apenas o caractere da tabela unicode
		char valor = 65;
		System.out.println(valor);

		/*
		 * Não compila! valor = valor + 1;
		 */

		// fazendo casting abaixo
		valor = (char) (valor + 1);
		System.out.println(valor);

		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);

		palavra = palavra + 2020;
		System.out.println(palavra);
	}

}

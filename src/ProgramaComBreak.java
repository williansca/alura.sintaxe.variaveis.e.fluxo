
public class ProgramaComBreak {
	
	public static void main(String[] args) {
		for (int linha = 1; linha <= 5; linha++) {
			for (int coluna = 1; coluna <= 5; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print(coluna);
			}
			System.out.println();
		}
	}

}

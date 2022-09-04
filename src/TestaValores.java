
public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;	//copia o valor e não a referência, segundo continuará sendo 5
		primeiro = 10;
		
		System.out.println(segundo);
	}

}

package scripts;

public class atv0002 {

	public static void main(String[] args) {
		int soma = 0;
		for(int i = 50; i > 0; i--) {
			if(i%2!=0) {
				System.out.println(i);
				soma+=i;
			}
		}
		System.out.println("A soma dos impares é: " + soma);

	}

}

package scripts;
import java.util.Scanner;

public class atv0005 {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Diga quantos meses de fatura: ");
		int meses = leitor.nextInt();
		
		double[] faturasArray = new double[meses];
		
		for(int i = 0; i < faturasArray.length; i++) {
			System.out.println(String.format("Qual é a fatura do %sº mês?:" , i+1));
			faturasArray[i] = leitor.nextDouble();
		}
		
		double media = 0;
		
		for(double faturas : faturasArray) {
			media+=faturas;
		}
		
		media/=faturasArray.length;
		
		System.out.println("A média das faturas é: " + media);
		

	}

}

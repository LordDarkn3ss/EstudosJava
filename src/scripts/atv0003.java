package scripts;
import java.util.Scanner;

public class atv0003 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Diga quantos alunos tem na sala: ");
		int quant = leitor.nextInt();
		
		double media = 0;
		
		for(int i = 0; i < quant; i++) {
			System.out.print(i+1 + "º aluno - media: ");
			media += leitor.nextDouble();
		}
		
		media = media/quant;
		
		System.out.println("A média da turma é: " + media);
	}

}

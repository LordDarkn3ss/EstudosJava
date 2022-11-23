package Fundamentos;
import java.util.Scanner;

public class e005 {
	

	public static double InputDouble(String texto) {
		Scanner entrada = new Scanner(System.in);
		System.out.print(texto);
		double resp = entrada.nextDouble();
		
		return resp;

	}
	/* public static String InputString(String texto) {
		Scanner entrada = new Scanner(System.in);
		System.out.print(texto);
		String resp = entrada.toString();
		
		return resp;

	} */

	public static void main(String[] args) {
			
		
		
		double valor = InputDouble("Digite um valor: ");
		
		if(valor == 0) {
			System.out.println("Nem positivo nem negativo, é zero");
		}
		else {
			if(valor>0) {
				System.out.println("É positivo");
			}
			else {
				System.out.println("É negativo");
			}
		} 
			
	}
}

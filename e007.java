package Fundamentos;

import java.util.Scanner;

public class e007 {
	public static double InputDouble(String texto) {
		Scanner entrada = new Scanner(System.in);
		System.out.print(texto);
		double resp = entrada.nextDouble();
		
		return resp;

	}
	
	public static void main(String[] args) {
		double valor = InputDouble("Diga um número de 1 a 7: ");
		if(valor == 1) System.out.println("DOMINGO");
		else if(valor == 2) System.out.println("SEGUNDA");
		else if(valor == 3) System.out.println("TERÇA");
		else if(valor == 4) System.out.println("QUARTA");
		else if(valor == 5) System.out.println("QUINTA");
		else if(valor == 6) System.out.println("SEXTA");
		else if(valor == 7) System.out.println("SÁBADO");
		else System.out.println("VALOR INVALIDO");
	}
}

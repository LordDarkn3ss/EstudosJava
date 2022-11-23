package Fundamentos;

import java.util.Scanner;

public class e006 {
	public static double InputDouble(String texto) {
		Scanner entrada = new Scanner(System.in);
		System.out.print(texto);
		double resp = entrada.nextDouble();
		
		return resp;

	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); //UMA VEZ!!!!!!
		
		
		System.out.println("FALE ALGO AE");
		double valor1 = entrada.nextDouble(); // PRIMEIRA VARIAVEL
		
		System.out.println("FALE ALGO AE");
		double valor2 = entrada.nextDouble(); // SEGUNDA VARIAVEL
		
		System.out.println("FALE ALGO AE");
		double valor3 = entrada.nextDouble(); // SEGUNDA VARIAVEL
		
		double maior, menor;
		
		if(valor1 > valor2 && valor1 > valor3) maior = valor1;
		else
			if (valor2<valor3) menor = valor2;
			else menor = valor3;
		
		if(valor2 > valor3 && valor2 > valor1) maior = valor2;
		else
			if (valor1<valor3) menor = valor1;
			else menor = valor3;
		
		if(valor3 > valor2 && valor3 > valor2) maior = valor3;
		else
			if (valor2<valor1) menor = valor2;
			else menor = valor1;
		/*
		double a = InputDouble("Diga um valor: ");
		double b = InputDouble("Diga outro valor: ");
		double c = InputDouble("Diga outro valor: ")*/

	}
	
}

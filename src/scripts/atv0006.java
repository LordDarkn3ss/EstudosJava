package scripts;

import java.util.Scanner;

public class atv0006 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double media1 = 0;
		double media2 = 0;
		
		double[] kmArray = new double[14];
		
		for(int i = 0; i < 14; i++) {
			System.out.println("Quantos KM no "+(i+1)+"º dia?: ");
			
			kmArray[i] = leitor.nextDouble();
		}
		
		for(int i = 0; i < 14; i++) {
			
			if(i < 7){
				media1+=kmArray[i]; 
			}
			else{
				media2 += kmArray[i];
			}
		}
		
		System.out.println("Média de KM na semana 1: "+media1/7);
		System.out.println("Média de KM na semana 2: "+media2/7);
		System.out.println("Média de KM dos 14 dias: "+(media1+media2)/14);

	}

}

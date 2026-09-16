package Lista0;

import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor em Fahrenheit: ");
		
		double f = sc.nextDouble(); 

		
		int c = (int) ((f - 32) * (5.0 / 9.0));

		System.out.print("Valor em celsius: " + c);
		
		sc.close(); 
	}
}

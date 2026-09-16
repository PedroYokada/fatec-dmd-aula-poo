package Lista0;
import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor em Fahrenheit: ");
		double f = sc.nextDouble();
		
		double celsius = (f-32.0) * (5.0/9.0);
		
		System.out.print("Valor em celsius: " + celsius);
		
		sc.close(); 

	}

}

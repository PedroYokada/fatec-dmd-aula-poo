package lista1_POO;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o peso: ");
		double peso = sc.nextDouble();

		System.out.println("Insira a altura: ");
		double altura = sc.nextDouble();

		double imc = peso / (altura * altura);

		if (imc < 18.5) {
			System.out.println("Abaixo do Peso");
		} else if (imc <= 24.9) {
			System.out.println("Normal");
		} else if (imc <= 29.9) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obesidade");
		}

	}

}

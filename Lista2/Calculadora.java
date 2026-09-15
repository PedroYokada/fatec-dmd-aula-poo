package lista1_POO;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("--------------------------");
		System.out.println("--------CALCULADORA-------");

		System.out.print("--------------------------");
		System.out.print("Insira o a operação");
		System.out.print("+- ADIÇÃO");
		System.out.print("-- SUBTRAÇÃO");
		System.out.print("*- MULTIPLICAÇÃO");
		System.out.print("/- DIVISÃO");
		System.out.print("5- SAIR");
		System.out.println("--------------------------");

		String opcao = sc.nextLine();

		if (opcao == "5") {
			System.out.println("Saindo....");
			sc.close();
		} else {
			System.out.println("Valor inválido");
			sc.close();
			return;
		}

		System.out.println("Insira o primeiro numero: ");
		Double n1 = sc.nextDouble();

		System.out.println("Insira o segundo numero: ");
		Double n2 = sc.nextDouble();

		Double n3 = 0.00;

		switch (opcao) {
		case "+":
			n3 = n1 + n2;
			break;
		case "-":
			n3 = n1 - n2;
			break;
		case "*":
			n3 = n1 * n2;
			break;
		case "/":
			if (n2 != 0) {
				n3 = n1 / n2;
				break;
			} else {
				System.out.println("Denominador não pode ser igual a 0");
				break;
			}
		}

		System.out.println("RESULTADO = " + n3);
	}

}

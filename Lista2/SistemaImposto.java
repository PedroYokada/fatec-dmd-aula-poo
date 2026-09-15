package lista1_POO;

import java.util.Scanner;

public class SistemaImposto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o salário:");

		Double salario = sc.nextDouble();
		Double desconto = 0.00;

		if (salario <= 2000) {
			System.out.println("Isento");
		} else if (salario <= 5000) {
			desconto = salario * 0.10;
		} else {
			desconto = salario * 0.20;
		}

		System.out.println("Salário = " + salario);
		System.out.println("Desconto = " + desconto);
	}

}

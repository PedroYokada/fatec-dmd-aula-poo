package lista1_POO;

import java.util.Scanner;

public class ClassificacaoIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o numero entre 10 e 50: ");

		int idade = sc.nextInt();
		sc.nextLine();

		if (idade >= 0 && idade <= 12) {
			System.out.println("Criança");
		} else if (idade > 12 && idade <= 17) {
			System.out.println("Adolescente");
		} else if (idade > 18 && idade <= 59) {
			System.out.println("Adulto");
		} else if (idade >= 60) {
			System.out.println("Idoso");
		} else {
			System.out.println("Valor/caractere inválido");
		}

	}

}

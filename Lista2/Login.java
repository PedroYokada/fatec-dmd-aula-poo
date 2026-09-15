package lista1_POO;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o usuario: ");

		String usuario = sc.nextLine();

		System.out.println("Insira o usuario: ");

		String senha = sc.nextLine();

		if (usuario.equals("admin") && senha.equals("1234")) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}

	}

}

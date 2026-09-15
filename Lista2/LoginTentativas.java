package lista1_POO;

import java.util.Scanner;

public class LoginTentativas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tentativas = 3;

		String user = "";
		String senha = "";

		while (tentativas > 0) {

			System.out.print("Insira o usuario: ");
			String user1 = sc.nextLine();

			System.out.print("Insira a senha: ");
			String senha1 = sc.nextLine();

			if (user1.equals("Pedro@1029") && senha1.equals("1234")) {
				System.out.println("Login realizado com sucesso!");
				break;
			} else {
				tentativas--;

				System.out.println("Senha e/ou usuário incorretos.");

				System.out.println("Tentativas restantes: " + tentativas);
			}

			if (tentativas == 0) {
				System.out.println("Numero de tentativas excedidas");
			}

		}

		sc.close();
	}

}

package funcoes;

import java.util.Scanner;

public class SistemaDeLogin {

	public static String lerUsuario(Scanner sc) {

		System.out.print("Insira o usuario: ");

		String usuario = sc.nextLine();
		return usuario;
	}

	public static String lerSenha(Scanner sc) {
		System.out.print("Insira a senha: ");

		String senha = sc.nextLine();
		return senha;
	}

	public static String validarLogin(String usuario, String senha) {
		if (usuario.equals("pedroyokada") && senha.equals("pedro123")) {
			return "Usuário e senha corretos.";
		} else {
			return "Usuário e/ou senha incorretos.";
		}

	}

	public static void mostrarResultado(String resultado) {

		System.out.println(resultado);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String usuario = lerUsuario(sc);

		String senha = lerSenha(sc);

		String resultado = validarLogin(usuario, senha);

		mostrarResultado(resultado);

		sc.close();

	}

}

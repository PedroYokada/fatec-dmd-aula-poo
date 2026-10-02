package funcoes;

public class SeparandoImpressao {

	public static void MostrarTitulo() {
		System.out.println("===============");
		System.out.println("   SISTEMA");
		System.out.println("===============");
	}

	public static void MostrarMenu() {
		System.out.println("1 - Entrar");
		System.out.println("2 - Sair");
	}

	public static void main(String[] args) {
		MostrarTitulo();
		MostrarMenu();
	}

}

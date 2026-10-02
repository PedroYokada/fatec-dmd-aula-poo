package funcoes;

public class ContadorInteligente {

	public static void mostrarNumeros() {

		for (int i = 1; i <= 100; i++) {

			System.out.println(i);

		}
	}

	public static void mostrarPares() {

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
	}

	public static void mostrarImpares() {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[] args) {
		System.out.println("\n-- Todos os números do contador --");

		mostrarNumeros();

		System.out.println("\n-- Números Pares --");

		mostrarPares();

		System.out.println("\n-- Números Ímpares --");

		mostrarImpares();

	}

}

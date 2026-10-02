package funcoes;

import java.util.Scanner;

public class SistemaDeNotas {

	public static double lerNota(Scanner sc) {
		System.out.println("Insira as notas: ");

		return sc.nextDouble();
	}

	public static double calcularMedia(double n1, double n2, double n3) {
		double media = (n2 + n2 + n3) / 3;
		return media;
	}

	public static String verificarSituacao(double media) {
		if (media < 4) {
			return "Aluno Reprovado";
		} else if (media < 6) {
			return "Aluno em Recuperação";
		} else {
			return "Aluno Aprovado";
		}
	}

	public static void mostrarResultado(double media, String mensagem) {
		System.out.println("Média = " + media);
		System.out.println(mensagem);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n1 = lerNota(sc);
		double n2 = lerNota(sc);
		double n3 = lerNota(sc);

		double media = calcularMedia(n1, n2, n3);

		String situacao = verificarSituacao(media);
		mostrarResultado(media, situacao);

		sc.close();

	}

}

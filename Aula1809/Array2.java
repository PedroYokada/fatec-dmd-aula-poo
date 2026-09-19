package pacote;

public class Array2 {

	private static int somar(int[] p) {
		int soma = 0;

		for (int i = 0; i < p.length; i++) {
			soma += p[i];
		}
		return soma;
	}

	private static void imprimir(int[] v) {
		System.out.print("[");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			if (i < v.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		int[] v = new int[6];

		for (int i = 0; i < v.length; i++) {
			v[i] = i + 5;
		}

		imprimir(v);
		int valor = somar(v);
		System.out.println("SOMA = " + valor);
	}
}

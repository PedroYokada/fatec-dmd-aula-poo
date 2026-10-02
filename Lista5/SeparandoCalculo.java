package funcoes;

public class SeparandoCalculo {

	public static int operacao(int n1, int n2) {
		return n1 * n2;
	}

	public static void Multiplicar(int resultado) {

		System.out.println("RESULTADO = " + resultado);

	}

	public static void main(String[] args) {

		int resultado = operacao(40, 100);
		Multiplicar(resultado);
	}

}

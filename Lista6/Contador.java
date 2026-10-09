package objetos;

public class Contador {

	private int numero = 0;

	public void zerar() {
		numero = 0;
	}

	public void incrementar() {
		numero += 100;
	}

	public int mostrar() {
		return numero;
	}

	public static void main(String[] args) {
		Contador num = new Contador();

		num.incrementar();
		num.incrementar();

		System.out.println("Valor do contador: " + num.mostrar());

		num.zerar();

		System.out.println("Após zerar o numero: " + num.mostrar());
	}

}

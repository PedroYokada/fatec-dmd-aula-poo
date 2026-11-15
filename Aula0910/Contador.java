package objetos;

public class Contador {

	private int contagem = 0;

//	public Contador(int valorInicial) {
//		contagem = valorInicial();
//	} da erro porque voce cria um objeto sem atribuir 

	public void incrementar() {
		contagem++;
	}

	public void decrementar() {
		contagem--;
	}

	public void zerar() {
		contagem = 0;
	}

	public int mostrar() {
		return contagem;
	}

	public static void main(String[] args) {

		Contador valor = new Contador();

		System.out.println("Contagem = " + valor.mostrar());

		valor.incrementar();

		System.out.println("Contagem = " + valor.mostrar());

		valor.incrementar();

		System.out.println("Contagem = " + valor.mostrar());

		valor.decrementar();

		System.out.println("Contagem = " + valor.mostrar());

		valor.zerar();

		System.out.println("Contagem = " + valor.mostrar());

	}

}

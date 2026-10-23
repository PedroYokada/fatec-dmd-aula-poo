package objetos;

public class Conjunto {

	private String[] elementos = new String[2];
	private int quantidade = 0;

	public void adicionar(String elemento) {

		for (int i = 0; i < quantidade; i++) {

			if (elementos[i].equals(elemento)) {
				return;
			}
		}

		if (quantidade == elementos.length) {

			String[] novoArray = new String[elementos.length * 2];

			for (int i = 0; i < elementos.length; i++) {
				novoArray[i] = elementos[i];
			}

			elementos = novoArray;
		}

		elementos[quantidade] = elemento;
		quantidade++;
	}

	public boolean verificar(String elemento) {

		for (int i = 0; i < quantidade; i++) {

			if (elementos[i].equals(elemento)) {
				return true;
			}

		}
		return false;
	}

	public Conjunto uniao(Conjunto outroConjunto) {
		Conjunto novoConjunto = new Conjunto();
		for (int i = 0; i < quantidade; i++) {
			novoConjunto.adicionar(elementos[i]);
		}
		for (int i = 0; i < outroConjunto.quantidade; i++) {
			novoConjunto.adicionar(outroConjunto.elementos[i]);
		}
		return novoConjunto;
	}

	public Conjunto inter(Conjunto outroConjunto) {
		Conjunto novoConjunto = new Conjunto();

		for (int i = 0; i < quantidade; i++) {
			if (outroConjunto.verificar(elementos[i])) {
				novoConjunto.adicionar(elementos[i]);
			}

		}
		return novoConjunto;
	}

	public Conjunto menos(Conjunto outroConjunto) {
		Conjunto novoConjunto = new Conjunto();

		for (int i = 0; i < quantidade; i++) {
			if (!outroConjunto.verificar(elementos[i])) {
				novoConjunto.adicionar(elementos[i]);
			}
		}

		return novoConjunto;
	}

	public static void main(String[] args) {

		Conjunto conjunto1 = new Conjunto();
		Conjunto conjunto2 = new Conjunto();

		// Teste do método adicionar
		conjunto1.adicionar("Java");
		conjunto1.adicionar("Python");
		conjunto1.adicionar("C#");

		conjunto2.adicionar("Python");
		conjunto2.adicionar("C#");
		conjunto2.adicionar("JavaScript");

		// Teste de elemento repetido
		conjunto1.adicionar("Java");

		System.out.println("Conjunto 1:");
		for (int i = 0; i < conjunto1.quantidade; i++) {
			System.out.println(conjunto1.elementos[i]);
		}

		System.out.println();

		System.out.println("Conjunto 2:");
		for (int i = 0; i < conjunto2.quantidade; i++) {
			System.out.println(conjunto2.elementos[i]);
		}

		System.out.println();

		// Teste do método verificar
		System.out.println("Java existe no conjunto 1? " + conjunto1.verificar("Java"));

		System.out.println("JavaScript existe no conjunto 1? " + conjunto1.verificar("JavaScript"));

		System.out.println();

		// Teste da união
		Conjunto resultadoUniao = conjunto1.uniao(conjunto2);

		System.out.println("União:");
		for (int i = 0; i < resultadoUniao.quantidade; i++) {
			System.out.println(resultadoUniao.elementos[i]);
		}

		System.out.println();

		// Teste da interseção
		Conjunto resultadoInter = conjunto1.inter(conjunto2);

		System.out.println("Interseção:");
		for (int i = 0; i < resultadoInter.quantidade; i++) {
			System.out.println(resultadoInter.elementos[i]);
		}

		System.out.println();

		// Teste da subtração
		Conjunto resultadoMenos = conjunto1.menos(conjunto2);

		System.out.println("Conjunto 1 menos Conjunto 2:");
		for (int i = 0; i < resultadoMenos.quantidade; i++) {
			System.out.println(resultadoMenos.elementos[i]);
		}
	}

}

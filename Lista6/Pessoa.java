package objetos;

public class Pessoa {

	private String nome;
	private Pessoa pai;
	private Pessoa mae;

	public Pessoa(String nome, Pessoa pai, Pessoa mae) {
		this.nome = nome;
		this.pai = pai;
		this.mae = mae;
	}

	public Pessoa(String nome) {
		this.nome = nome;
		this.pai = null;
		this.mae = null;
	}

	public boolean mesmaPessoa(Pessoa pessoa) {

		if (pessoa == null) {
			return false;
		}

		if (nome.equals(pessoa.nome) && mae == pessoa.mae) {
			return true;
		} else {
			return false;
		}
	}

	public boolean irmaos(Pessoa pessoa) {

		if (pessoa == null) {
			return false;
		}

		if ((pai != null && pai == pessoa.pai) || (mae != null && mae == pessoa.mae)) {

			return true;
		} else {
			return false;
		}
	}

	public boolean antecessor(Pessoa pessoa) {

		if (pessoa == null) {
			return false;
		}

		if (pai != null) {

			if (pai.mesmaPessoa(pessoa)) {
				return true;
			}

			if (pai.antecessor(pessoa)) {
				return true;
			}
		}

		if (mae != null) {

			if (mae.mesmaPessoa(pessoa)) {
				return true;
			}

			if (mae.antecessor(pessoa)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		// Avós de Pedro e João
		Pessoa antonio = new Pessoa("Antonio");
		Pessoa helena = new Pessoa("Helena");

		// Pais de Pedro e João
		Pessoa marcos = new Pessoa("Marcos", antonio, helena);
		Pessoa fernanda = new Pessoa("Fernanda");

		// Filhos
		Pessoa pedro = new Pessoa("Pedro", marcos, fernanda);
		Pessoa joao = new Pessoa("João", marcos, fernanda);

		// Teste de irmãos
		System.out.println("Pedro e João são irmãos? " + pedro.irmaos(joao));

		// Teste de pai como antecessor
		System.out.println("Marcos é antecessor de Pedro? " + pedro.antecessor(marcos));

		// Teste de avô como antecessor
		System.out.println("Antonio é antecessor de Pedro? " + pedro.antecessor(antonio));

		// Teste de avó como antecessora
		System.out.println("Helena é antecessora de Pedro? " + pedro.antecessor(helena));

		// João é irmão, não antecessor
		System.out.println("João é antecessor de Pedro? " + pedro.antecessor(joao));
	}
}
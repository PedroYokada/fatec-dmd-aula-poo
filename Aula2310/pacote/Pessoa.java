package pacote;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int cpf;
	private String corDeCabelo;

	public Pessoa(String n, int c) {
		nome = n.split(" ")[0];
		sobrenome = n.split(" ")[0];
		cpf = c;
	}

	public void setCorDeCabelo(String c) {
		corDeCabelo = c;
	}

	public String getCorDeCabelo() {
		return corDeCabelo;
	}

	public String getNome() {
		return nome;
	}

//	@Override
//	public boolean equals(Object obj) {
//		return super.equals(obj);
//	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pessoa) {
			Pessoa p = (Pessoa) obj;
			return this.cpf == p.cpf;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", corDeCabelo=" + corDeCabelo
				+ "]";
	}

	public static void main(String[] args) {

		Pessoa andriele = new Pessoa("Andriele", 1234567830);

		andriele.setCorDeCabelo("Castanho");

		System.out.println(andriele.getCorDeCabelo());
		System.out.println(andriele.getNome());
	}

}

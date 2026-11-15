package aula;

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

	public static void main(String[] args) {

		Pessoa andriele = new Pessoa("Andriele", 1234567830);

		andriele.setCorDeCabelo("Castanho");

		System.out.println(andriele.getCorDeCabelo());
		System.out.println(andriele.getNome());
	}
}
package br.edu.sp.cps.fatec.barueri.dmd.aula0210;

public class Gato {

	public static String VARIAVEL_GATO = "1";

	String nome;
	String raca;
	int qtdPatas;
	String cor;

	public Gato() {
	}

	public Gato(String nome, String raca, int qtdPatas, String cor) {
		this.nome = nome;
		this.raca = raca;
		this.qtdPatas = qtdPatas;
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Gato [Nome: " + nome + ", Raça: " + raca + ", Patas: " + qtdPatas + ", Cor: " + cor + "]";
	}

	public void miar() {
		System.out.println("MIAUUUUUUUUUUUU!");
	}
}

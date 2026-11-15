package xadrez;

public interface Peca {

	Cor getCor();

	String getSimbolo();

	boolean movimentoValido(Posicao origem, Posicao destino, Tabuleiro tabuleiro);
}
package xadrez;

public class Rei extends PecaBase {

	public Rei(Cor cor) {
		super(cor);
	}

	@Override
	public String getSimbolo() {

		if (getCor() == Cor.BRANCO) {
			return "R";
		} else {
			return "r";
		}
	}

	@Override
	public boolean movimentoValido(Posicao origem, Posicao destino, Tabuleiro tabuleiro) {

		int linha = Math.abs(destino.getLinha() - origem.getLinha());

		int coluna = Math.abs(destino.getColuna() - origem.getColuna());

		return linha <= 1 && coluna <= 1 && (linha != 0 || coluna != 0);
	}

}

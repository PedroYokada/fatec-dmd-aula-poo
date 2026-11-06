package xadrez;

public class Rainha extends PecaBase {

	public Rainha(Cor cor) {
		super(cor);
	}

	@Override
	public String getSimbolo() {
		if (getCor() == Cor.BRANCO) {
			return "C";
		} else {
			return "c";
		}
	}

	@Override
	public boolean movimentoValido(Posicao origem, Posicao destino, Tabuleiro tabuleiro) {
		int linha = Math.abs(destino.getLinha() - origem.getLinha());
		int coluna = Math.abs(destino.getColuna() - origem.getColuna());

		boolean reto = origem.getLinha() == destino.getLinha() || origem.getColuna() == destino.getColuna();

		boolean diagonal = linha == coluna;

		return reto || diagonal;

	}

}

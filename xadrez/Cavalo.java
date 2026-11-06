package xadrez;

public class Cavalo extends PecaBase {

	public Cavalo(Cor cor) {
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

		if (linha == 2 && coluna == 1) {
			return true;
		}

		if (linha == 1 && coluna == 2) {
			return true;
		}

		return false;
	}

}

package xadrez;

public class Peao extends PecaBase {

	public Peao(Cor cor) {
		super(cor);
	}

	@Override
	public String getSimbolo() {
		if (getCor() == Cor.BRANCO) {
			return "P";
		} else {
			return "p";
		}
	}

	@Override
	public boolean movimentoValido(Posicao origem, Posicao destino, Tabuleiro tabuleiro) {

		int direcao;

		if (getCor() == Cor.BRANCO) {
			direcao = -1;
		} else {
			direcao = 1;
		}
		return destino.getLinha() == origem.getLinha() + direcao && destino.getColuna() == origem.getColuna();
	}

}

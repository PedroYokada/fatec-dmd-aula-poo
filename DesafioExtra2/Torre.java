package xadrez;

public class Torre extends PecaBase {

	public Torre(Cor cor) {
		super(cor);
	}

	@Override
	public String getSimbolo() {

		if (getCor() == Cor.BRANCO) {
			return "T";
		} else {
			return "t";
		}
	}

	@Override
	public boolean movimentoValido(Posicao origem, Posicao destino, Tabuleiro tabuleiro) {
		boolean mesmaLinha = origem.getLinha() == destino.getLinha();

		boolean mesmaColuna = origem.getColuna() == destino.getColuna();

		return mesmaLinha || mesmaColuna;

	}

}

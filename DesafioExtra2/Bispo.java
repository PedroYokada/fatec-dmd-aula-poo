package xadrez;

public class Bispo extends PecaBase {

	public Bispo(Cor cor) {
		super(cor);
	}

	@Override
	public String getSimbolo() {
		if (getCor() == Cor.BRANCO) {
			return "B";
		} else {
			return "b";
		}
	}

	@Override
	public boolean movimentoValido(Posicao origem, Posicao destino, Tabuleiro tabuleiro) {
		int linha = Math.abs(destino.getLinha() - origem.getLinha());
		int coluna = Math.abs(destino.getColuna() - origem.getColuna());

		return linha == coluna;
	}

}

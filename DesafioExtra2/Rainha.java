package xadrez;

public class Rainha extends PecaBase {

	public Rainha(Cor cor) {
		super(cor);
	}

	@Override
	public String getSimbolo() {
		if (getCor() == Cor.BRANCO) {
			return "D";
		} else {
			return "d";
		}
	}

	@Override
	public boolean movimentoValido(Posicao origem, Posicao destino, Tabuleiro tabuleiro) {
		int linha = Math.abs(destino.getLinha() - origem.getLinha());
		int coluna = Math.abs(destino.getColuna() - origem.getColuna());

		boolean reto = origem.getLinha() == destino.getLinha() || origem.getColuna() == destino.getColuna();

		boolean diagonal = linha == coluna;

		if ((linha == 0 && coluna == 0) || (!reto && !diagonal)) {
            return false;
        }

        int direcaoLinha = Integer.compare(destino.getLinha(), origem.getLinha());
        int direcaoColuna = Integer.compare(destino.getColuna(), origem.getColuna());
        int linhaAtual = origem.getLinha() + direcaoLinha;
        int colunaAtual = origem.getColuna() + direcaoColuna;

        // A rainha não pode atravessar outras peças.
        while (linhaAtual != destino.getLinha() || colunaAtual != destino.getColuna()) {
            if (!tabuleiro.estaVazia(new Posicao(linhaAtual, colunaAtual))) {
                return false;
            }
            linhaAtual += direcaoLinha;
            colunaAtual += direcaoColuna;
        }

        // A captura de peças aliadas/adversárias deve ser controlada pela Partida.
        return true;

	}

}

package xadrez;

public class Tabuleiro {

	private Peca[][] casas = new Peca[8][8];

	public Peca getPeca(Posicao posicao) {
		return casas[posicao.getLinha()][posicao.getColuna()];
	}

	public void colocarPeca(Peca peca, Posicao posicao) {
		casas[posicao.getLinha()][posicao.getColuna()] = peca;
	}

	public boolean estaVazia(Posicao posicao) {
		return getPeca(posicao) == null;
	}

	public void mostrar() {

		System.out.println();

		for (int linha = 0; linha < 8; linha++) {

			System.out.print((8 - linha) + "  ");

			for (int coluna = 0; coluna < 8; coluna++) {

				Peca peca = casas[linha][coluna];

				if (peca == null) {

					System.out.print(". ");

				} else {

					System.out.print(peca.getSimbolo() + " ");
				}
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("   a b c d e f g h");
	}

	public void montarTabuleiro() {
		colocarPeca(new Torre(Cor.PRETO), new Posicao(0, 0));
		colocarPeca(new Cavalo(Cor.PRETO), new Posicao(0, 1));
		colocarPeca(new Bispo(Cor.PRETO), new Posicao(0, 2));
		colocarPeca(new Rainha(Cor.PRETO), new Posicao(0, 3));
		colocarPeca(new Rei(Cor.PRETO), new Posicao(0, 4));
		colocarPeca(new Bispo(Cor.PRETO), new Posicao(0, 5));
		colocarPeca(new Cavalo(Cor.PRETO), new Posicao(0, 6));
		colocarPeca(new Torre(Cor.PRETO), new Posicao(0, 7));

		for (int coluna = 0; coluna < 8; coluna++) {
			colocarPeca(new Peao(Cor.PRETO), new Posicao(1, coluna));
		}

		for (int coluna = 0; coluna < 8; coluna++) {
			colocarPeca(new Peao(Cor.BRANCO), new Posicao(6, coluna));
		}

		colocarPeca(new Torre(Cor.BRANCO), new Posicao(7, 0));
		colocarPeca(new Cavalo(Cor.BRANCO), new Posicao(7, 1));
		colocarPeca(new Bispo(Cor.BRANCO), new Posicao(7, 2));
		colocarPeca(new Rainha(Cor.BRANCO), new Posicao(7, 3));
		colocarPeca(new Rei(Cor.BRANCO), new Posicao(7, 4));
		colocarPeca(new Bispo(Cor.BRANCO), new Posicao(7, 5));
		colocarPeca(new Cavalo(Cor.BRANCO), new Posicao(7, 6));
		colocarPeca(new Torre(Cor.BRANCO), new Posicao(7, 7));

	}
}

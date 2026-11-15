package xadrez;

public abstract class PecaBase implements Peca {

	private Cor cor;

	public PecaBase(Cor cor) {
		this.cor = cor;
	}

	@Override
	public Cor getCor() {
		return cor;
	}

}


package Interface;

public interface Voador {

	void voar();

	default void cair() {

		logicaComum("Socorro vou morrer");

	}

	default void mover() {

		logicaComum("Movimento maroto no ar");

	}

	default void logicaComum(String mensagem) {

		System.out.println(mensagem);

	}

	public static void voa(Voador animal) {
		animal.voar();
		animal.cair();
		animal.mover();
	}

}

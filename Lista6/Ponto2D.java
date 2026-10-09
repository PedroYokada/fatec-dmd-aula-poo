package objetos;

public class Ponto2D {

	// Atributos do ponto
	// Valores encapsulados, ou seja, não podem ser acessados diretamente fora da
	// classe
	private double pontox;
	private double pontoy;

	// EXERCÍCIO A - i)
	// Construtor sem parâmetros, cria o ponto na origem (0,0)
	public Ponto2D() {
		this.pontox = 0;
		this.pontoy = 0;
	}

	// EXERCÍCIO A - ii)
	// Construtor que cria o ponto usando valores de x e y
	public Ponto2D(double x, double y) {
		this.pontox = x;
		this.pontoy = y;
	}

	// EXERCÍCIO A - iii)
	// Construtor que cria um novo ponto copiando outro ponto
	public Ponto2D(Ponto2D segundoPonto) {
		this.pontox = segundoPonto.pontox;
		this.pontoy = segundoPonto.pontoy;
	}

	// EXERCÍCIO B
	// Retorna o valor de x
	public double getX() {
		return pontox;
	}

	// EXERCÍCIO B
	// Altera o valor de x
	public void setX(double x) {
		this.pontox = x;
	}

	// EXERCÍCIO B
	// Retorna o valor de y
	public double getY() {
		return pontoy;
	}

	// EXERCÍCIO B
	// Altera o valor de y
	public void setY(double y) {
		this.pontoy = y;
	}

	// EXERCÍCIO C
	// Move o ponto para a origem (0,0)
	public void mover() {
		this.pontox = 0;
		this.pontoy = 0;
	}

	// EXERCÍCIO C
	// Move o ponto para novos valores de x e y
	public void mover(double x, double y) {
		this.pontox = x;
		this.pontoy = y;
	}

	// EXERCÍCIO C
	// Move o ponto para a mesma posição de outro ponto
	public void mover(Ponto2D segundoPonto) {
		this.pontox = segundoPonto.pontox;
		this.pontoy = segundoPonto.pontoy;
	}

	// EXERCÍCIO D
	// Compara se dois pontos possuem os mesmos valores de x e y
	@Override
	public boolean equals(Object objeto) {

		if (objeto instanceof Ponto2D) {

			Ponto2D segundoPonto = (Ponto2D) objeto;

			return this.pontox == segundoPonto.pontox && this.pontoy == segundoPonto.pontoy;
		}

		return false;
	}

	// EXERCÍCIO E
	// Mostra o objeto em forma de texto
	@Override
	public String toString() {
		return "Ponto2D (" + pontox + " , " + pontoy + ")";
	}

	// EXERCÍCIO - DISTÂNCIA
	// Calcula a distância deste ponto até outro ponto
	public double distancia(Ponto2D segundoPonto) {

		double diferencaX = segundoPonto.pontox - this.pontox;
		double diferencaY = segundoPonto.pontoy - this.pontoy;

		return Math.sqrt(Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2));
	}

	// EXERCÍCIO F
	// Cria um novo ponto com os mesmos valores do ponto atual
	@Override
	public Ponto2D clone() {
		return new Ponto2D(this.pontox, this.pontoy);
	}

	public static void main(String[] args) {

		// Criação dos pontos para testar o exercício
		Ponto2D ponto1 = new Ponto2D(0, 0);
		Ponto2D ponto2 = new Ponto2D(3, 4);

		// EXERCÍCIO E - imprime os pontos usando toString()
		System.out.println("Ponto 1: " + ponto1);
		System.out.println("Ponto 2: " + ponto2);

		// EXERCÍCIO - DISTÂNCIA
		System.out.println("Distância: " + ponto1.distancia(ponto2));

		// EXERCÍCIO F - cria uma cópia do ponto2
		Ponto2D pontoClonado = ponto2.clone();

		System.out.println("Clone: " + pontoClonado);

		// EXERCÍCIO D - compara o ponto2 com o clone
		System.out.println("São iguais? " + ponto2.equals(pontoClonado));
	}
}
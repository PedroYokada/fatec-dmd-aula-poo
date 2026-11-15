package objetos;

public class CirculoPlanoCartesiano {

	// Atributos
	private double raio;
	private Ponto2D centro;

	// A) Construtor com raio e centro
	public CirculoPlanoCartesiano(double raio, Ponto2D centro) {
		setRaio(raio);
        if (centro == null) {
            throw new IllegalArgumentException("Centro não pode ser nulo.");
        }
        this.centro = new Ponto2D(centro);
	}

	// B) Construtor com raio e centro na origem
	public CirculoPlanoCartesiano(double raio) {
		this(raio, new Ponto2D());
	}

	// C) Getter do raio
	public double getRaio() {
		return raio;
	}

	// C) Setter do raio
	public void setRaio(double raio) {
        if (!Double.isFinite(raio) || raio < 0) {
            throw new IllegalArgumentException("O raio deve ser finito e não negativo.");
        }
        this.raio = raio;
    }

	// D) Inflar por um valor
	public void inflar(double valor) {
		if (!Double.isFinite(valor) || valor < 0) {
            throw new IllegalArgumentException("Valor para inflar inválido.");
        }
        setRaio(this.raio + valor);
	}

	// D) Desinflar por um valor
	public void desinflar(double valor) {
		if (!Double.isFinite(valor) || valor < 0 || valor > this.raio) {
            throw new IllegalArgumentException("Valor para desinflar inválido.");
        }
        setRaio(this.raio - valor);
	}

	// E) Inflar em 1 unidade
	public void inflar() {
		inflar(1);
	}

	// E) Desinflar em 1 unidade
	public void desinflar() {
		desinflar(1);
	}

	// Move o círculo para a origem
	public void mover() {
		this.centro.mover();
	}

	// Move o círculo para uma posição x e y
	public void mover(double x, double y) {
		this.centro.mover(x, y);
	}

	// Move o círculo para a posição de outro ponto
	public void mover(Ponto2D outroPonto) {
		if (outroPonto == null) {
            throw new IllegalArgumentException("Ponto não pode ser nulo.");
        }
        this.centro.mover(outroPonto);
	}

	// F) Calcula a área do círculo
	public double calcularArea() {
		return Math.PI * raio * raio;
	}

	// MAIN - Testes no console
	public static void main(String[] args) {

		System.out.println("=== CÍRCULO NO PLANO CARTESIANO ===");

		// Criando o ponto central
		Ponto2D ponto = new Ponto2D(3, 4);

		// Criando o círculo
		CirculoPlanoCartesiano circulo = new CirculoPlanoCartesiano(5, ponto);

		// Estado inicial
		System.out.println("\nEstado inicial:");

		System.out.println("Centro: " + circulo.centro);
		System.out.println("Raio: " + circulo.getRaio());

		System.out.printf("Área: %.2f%n", circulo.calcularArea());

		// Inflando 2 unidades
		circulo.inflar(2);

		System.out.println("\nApós inflar 2 unidades:");
		System.out.println("Raio: " + circulo.getRaio());

		// Desinflando 1 unidade
		circulo.desinflar();

		System.out.println("\nApós desinflar 1 unidade:");
		System.out.println("Raio: " + circulo.getRaio());

		// Inflando automaticamente 1 unidade
		circulo.inflar();

		System.out.println("\nApós inflar 1 unidade:");
		System.out.println("Raio: " + circulo.getRaio());

		// Desinflando 2 unidades
		circulo.desinflar(2);

		System.out.println("\nApós desinflar 2 unidades:");
		System.out.println("Raio: " + circulo.getRaio());

		// Movendo o círculo para outro local
		circulo.mover(10, 20);

		System.out.println("\nApós mover para (10,20):");
		System.out.println("Centro: " + circulo.centro);

		// Movendo para outro ponto
		Ponto2D novoPonto = new Ponto2D(7, 8);

		circulo.mover(novoPonto);

		System.out.println("\nApós mover para outro ponto:");
		System.out.println("Centro: " + circulo.centro);

		// Movendo de volta para a origem
		circulo.mover();

		System.out.println("\nApós mover para a origem:");
		System.out.println("Centro: " + circulo.centro);

		// Área final
		System.out.printf("%nÁrea final: %.2f%n", circulo.calcularArea());
	}
}
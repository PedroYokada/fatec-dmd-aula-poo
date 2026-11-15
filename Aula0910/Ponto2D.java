package objetos;

public class Ponto2D {

	private double x;
	private double y;

	public Ponto2D() {
		x = 0;
		y = 0;
	}

	public Ponto2D(double x, double y) {
		this.x = x;
		this.x = y;
	}

	public Ponto2D(Ponto2D outro) {
		this.x = outro.x;
		this.y = outro.y;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

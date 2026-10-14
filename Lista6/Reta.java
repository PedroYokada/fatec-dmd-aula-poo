package objetos;

public class Reta {

    // Atributos
    private double a;
    private double b;

    // A.i - Construtor com coeficientes
    public Reta(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // A.ii - Construtor com dois pontos
    public Reta(Ponto2D ponto1, Ponto2D ponto2) {
        double diferencaX = ponto2.getX() - ponto1.getX();

        if (diferencaX == 0) {
            throw new IllegalArgumentException(
                "Nao e possivel representar uma reta vertical."
            );
        }

        this.a = (ponto2.getY() - ponto1.getY()) / diferencaX;
        this.b = ponto1.getY() - this.a * ponto1.getX();
    }

    // B - Métodos de acesso
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    // C - Verifica se um ponto pertence à reta
    public boolean pertence(Ponto2D ponto) {
        double yCalculado = this.a * ponto.getX() + this.b;

        return Math.abs(yCalculado - ponto.getY()) < 0.000000001;
    }

    // D - Representação String
    @Override
    public String toString() {
        return "y = " + a + "x "
             + (b < 0 ? "- " : "+ ")
             + Math.abs(b);
    }

    // E - Calcula a interseção
    public Ponto2D intersecao(Reta outra) {
        double diferencaA = this.a - outra.a;

        if (Math.abs(diferencaA) < 0.000000001) {
            return null;
        }

        double x = (outra.b - this.b) / diferencaA;
        double y = this.a * x + this.b;

        return new Ponto2D(x, y);
    }

    public static void main(String[] args) {

        Reta reta1 = new Reta(2, 1);

        System.out.println("Angular: " + reta1.getA());
        System.out.println("Linear: " + reta1.getB());

        Ponto2D ponto = new Ponto2D(3, 7);

        System.out.println("Pertence: " + reta1.pertence(ponto));
        System.out.println("Reta: " + reta1);

        Reta r = new Reta(1, 1);
        Reta s = new Reta(-2, 2);

        Ponto2D resultado = r.intersecao(s);

        System.out.println("Interseção: " + resultado);
    }
}
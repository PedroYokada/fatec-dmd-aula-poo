package objetos;

public class NumeroComplexo {

	private double numeroReal;
	private double numeroImaginario;

	public NumeroComplexo(double numeroReal, double numeroImaginario) {
		this.numeroReal = numeroReal;
		this.numeroImaginario = numeroImaginario;
	}

	public double getReal() {
		return numeroReal;
	}

	public void setReal(double numeroReal) {
		this.numeroReal = numeroReal;
	}

	public double getImaginario() {
		return numeroImaginario;
	}

	public void setImaginario(double numeroImaginario) {
		this.numeroImaginario = numeroImaginario;
	}

	public NumeroComplexo somar(NumeroComplexo outro) {

		double real = this.numeroReal + outro.getReal();
		double imaginario = this.numeroImaginario + outro.getImaginario();

		return new NumeroComplexo(real, imaginario);
	}

	public NumeroComplexo subtrair(NumeroComplexo outro) {

		double real = this.numeroReal - outro.getReal();
		double imaginario = this.numeroImaginario - outro.getImaginario();

		return new NumeroComplexo(real, imaginario);
	}

	public void multiplicar(NumeroComplexo outro) {

		double a = this.numeroReal;
		double b = this.numeroImaginario;
		double c = outro.getReal();
		double d = outro.getImaginario();

		this.numeroReal = (a * c) - (b * d);
		this.numeroImaginario = (a * d) + (b * c);
	}

	public void dividir(NumeroComplexo outro) {

		double a = this.numeroReal;
		double b = this.numeroImaginario;
		double c = outro.getReal();
		double d = outro.getImaginario();

		double denominador = (c * c) + (d * d);

		this.numeroReal = ((a * c) - (b * d)) / denominador;
		this.numeroImaginario = (a * d) + (b * c) / denominador;

	}

	public static void main(String[] args) {

	}
}
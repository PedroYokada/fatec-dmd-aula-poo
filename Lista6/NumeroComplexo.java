package objetos;

public class NumeroComplexo {

	// Atributos
	private double real;
	private double imaginaria;

	// A) Construtor
	public NumeroComplexo(double real, double imaginaria) {
		this.real = real;
		this.imaginaria = imaginaria;
	}

	// B) Getters e Setters
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginaria() {
		return imaginaria;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}

	// C) Soma
	public void somar(NumeroComplexo outroNumero) {
		this.real = this.real + outroNumero.real;
		this.imaginaria = this.imaginaria + outroNumero.imaginaria;
	}

	// D) Subtração
	public void subtrair(NumeroComplexo outroNumero) {
		this.real = this.real - outroNumero.real;
		this.imaginaria = this.imaginaria - outroNumero.imaginaria;
	}

	// E) Multiplicação
	public void multiplicar(NumeroComplexo outroNumero) {

		double a = this.real;
		double b = this.imaginaria;
		double c = outroNumero.real;
		double d = outroNumero.imaginaria;

		this.real = (a * c) - (b * d);
		this.imaginaria = (a * d) + (b * c);
	}

	// F) Divisão
	public void dividir(NumeroComplexo outroNumero) {

		double a = this.real;
		double b = this.imaginaria;
		double c = outroNumero.real;
		double d = outroNumero.imaginaria;

		double denominador = (c * c) + (d * d);

		this.real = ((a * c) + (b * d)) / denominador;
		this.imaginaria = ((b * c) - (a * d)) / denominador;
	}

	// G) Comparação
	@Override
	public boolean equals(Object objeto) {

		if (objeto instanceof NumeroComplexo) {

			NumeroComplexo outroNumero = (NumeroComplexo) objeto;

			return Double.compare(this.real, outroNumero.real) == 0
					&& Double.compare(this.imaginaria, outroNumero.imaginaria) == 0;
		}

		return false;
	}

	// H) Representação: a + bi
	@Override
	public String toString() {

		if (imaginaria >= 0) {
			return real + " + " + imaginaria + "i";
		}

		return real + " - " + Math.abs(imaginaria) + "i";
	}

	// I) Módulo
	public double modulo() {
		return Math.sqrt((real * real) + (imaginaria * imaginaria));
	}

	// Testes simples
	public static void main(String[] args) {

		NumeroComplexo numero1 = new NumeroComplexo(3, 4);
		NumeroComplexo numero2 = new NumeroComplexo(2, 1);

		System.out.println("Número 1: " + numero1);
		System.out.println("Número 2: " + numero2);

		// Soma
		NumeroComplexo resultado = new NumeroComplexo(3, 4);
		resultado.somar(numero2);
		System.out.println("Soma: " + resultado);

		// Subtração
		resultado = new NumeroComplexo(3, 4);
		resultado.subtrair(numero2);
		System.out.println("Subtração: " + resultado);

		// Multiplicação
		resultado = new NumeroComplexo(3, 4);
		resultado.multiplicar(numero2);
		System.out.println("Multiplicação: " + resultado);

		// Divisão
		resultado = new NumeroComplexo(3, 4);
		resultado.dividir(numero2);
		System.out.println("Divisão: " + resultado);

		// Comparação
		System.out.println("São iguais? " + numero1.equals(numero2));

		// Módulo
		System.out.println("Módulo do Número 1: " + numero1.modulo());
	}
}
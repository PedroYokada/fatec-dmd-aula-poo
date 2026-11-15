package lista1_POO;

import java.util.Scanner;

public class TipoTriangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o primero lado do triângulo: ");
		double a = sc.nextDouble();

		System.out.println("Insira o segundo lado do triângulo: ");
		double b = sc.nextDouble();

		System.out.println("Insira o terceiro lado do triângulo: ");
		double c = sc.nextDouble();

		if (!Double.isFinite(a) || !Double.isFinite(b) || !Double.isFinite(c)
                || a <= 0 || b <= 0 || c <= 0
                || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Os valores não formam um triângulo.");
        } else if (a == b && b == c) {
			System.out.println("A = " + a);
			System.out.println("B = " + b);
			System.out.println("C = " + c);
			System.out.println("Triângulo Equilátero.");
		} else if (a != b && a != c && b != c) {
			System.out.println("A = " + a);
			System.out.println("B = " + b);
			System.out.println("C = " + c);
			System.out.println("Triângulo Escaleno.");
		} else {
			System.out.println("A = " + a);
			System.out.println("B = " + b);
			System.out.println("C = " + c);
			System.out.println("Triângulo Isósceles.");
		}
        sc.close();
    }
}

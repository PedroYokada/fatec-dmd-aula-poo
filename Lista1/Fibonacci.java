package Lista0;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0, b = 1;
		int N = 30;

		for (int i = 0; i < N; i++) {

			System.out.println("Nº " + (i + 1) + ": " + a);

			int c = a + b;

			a = b;
			b = c;
		}

	}

}

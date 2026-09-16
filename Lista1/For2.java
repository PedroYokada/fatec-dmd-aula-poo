package Lista0;

public class For2 {

	public static void main(String[] args) {
		for (int a = 0, b = 2, c = 4; a < 10; a++, b++, c++) {
			if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
				System.out.println("A = " + a);
				System.out.println("B = " + b);
				System.out.println("C = " + c);
				System.out.println("--------------------------");
			}
		}
	}

}

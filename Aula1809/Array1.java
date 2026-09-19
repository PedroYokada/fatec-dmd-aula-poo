package pacote;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		int[] v = (null);
		v = new int[5];
		/*
		 * v[0] = 0; v[1] = 10; v[2] = 20; v[3] = 30; v[4] = 40;
		 */

		System.out.println("V = " + v[0]);

		System.out.println("-------- Incremento da array com laços --------------");

		for (int i = 0; i < 5; i++) {
			v[i] = i + 5;
		}

		System.out.println("-------- Leitura da array com laços --------------");

		for (int i = 0; i < 5; i++) {
			System.out.println(v[i]);
		}

	}

}

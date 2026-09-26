package exercicios;

public class exer3 {

	public static void main(final String[] args) {
		
		int[] valores = { 1, 2, 5,56789,2};
		int x = soma(valores);
		System.out.println(x);
	}

	private static int soma(int[]v) {
		int soma = 0;
		

		for (int i = 0; i < v.length; i++) {
			if (i == 3) {
				return soma;
			}
			soma += v[i];
		}
		
		return soma;
	}
	
	

}

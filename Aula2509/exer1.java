package exercicios;

public class exer1 {

	public static void main(String[] args) {
		int [] n = {1,2,3,4,5};
		int soma = 0;
		
		for (int i = 0; i < n.length; i++) {
			
			soma += n[i];
		}
		
		System.out.println("SOMA = " + soma);

	}

}

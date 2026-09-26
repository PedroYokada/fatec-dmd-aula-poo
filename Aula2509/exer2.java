package exercicios;

public class exer2 {
	
    
    static int laco(int x) {
        int[] n = {1, 2, 3, 4, 5, 10};
        int soma = 0;
        
        for (int i = 0; i < n.length; i++) {
            soma += n[i];
        }
        
        return soma;
    }

   
    public static void main(String[] args) {
        System.out.println(laco(0)); 
    }
}

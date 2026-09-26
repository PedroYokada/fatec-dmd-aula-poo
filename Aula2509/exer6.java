package exercicios;

import java.util.Arrays;

public class exer6 {
    
    public static void main(String[] args) {
        // Passo 1: Inicializar a estrutura da matriz irregular (jagged)
        // Os tamanhos das submatrizes são baseados nas linhas da imagem.
        int[][] matrizIrregular = new int[][] {
            new int[9],  // Linha 0: Para os números 1-9
            new int[10], // Linha 1: Para os números 10-19
            new int[8],  // Linha 2: Para os números 20-27
            new int[12], // Linha 3: Para os números 28-39
            new int[6],  // Linha 4: Para os números 40-45
            new int[2],  // Linha 5: Para os números 46-47
            new int[1],  // Linha 6: Para o número 48
            new int[8]   // Linha 7: Para os números 49-56
        };

        // Passo 2: Preencher a matriz com números sequenciais de 1 a 56
        int valorAtual = 1;
        for (int linha = 0; linha < matrizIrregular.length; linha++) {
            for (int coluna = 0; coluna < matrizIrregular[linha].length; coluna++) {
                matrizIrregular[linha][coluna] = valorAtual;
                valorAtual++;
            }
        }

  
        for (int[] arrayInterno : matrizIrregular) {
            // Usando Arrays.toString() para imprimir facilmente o conteúdo do array
            System.out.println(Arrays.toString(arrayInterno));
        }
    }
}

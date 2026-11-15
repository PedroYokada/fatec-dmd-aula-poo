package lista1_POO;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("--------CALCULADORA-------");
        System.out.println("--------------------------");
        System.out.println("Insira a operação:");
        System.out.println("+ - ADIÇÃO");
        System.out.println("- - SUBTRAÇÃO");
        System.out.println("* - MULTIPLICAÇÃO");
        System.out.println("/ - DIVISÃO");
        System.out.println("5 - SAIR");
        System.out.println("--------------------------");

        String opcao = sc.nextLine();

        // Compara o conteúdo da String, não a referência do objeto.
        if (opcao.equals("5")) {
            System.out.println("Saindo...");
            sc.close();
            return;
        }

        if (!opcao.equals("+") && !opcao.equals("-")
                && !opcao.equals("*") && !opcao.equals("/")) {
            System.out.println("Operação inválida.");
            sc.close();
            return;
        }

        System.out.print("Insira o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Insira o segundo número: ");
        double n2 = sc.nextDouble();

        double n3 = 0;

        switch (opcao) {
        case "+":
            n3 = n1 + n2;
            break;
        case "-":
            n3 = n1 - n2;
            break;
        case "*":
            n3 = n1 * n2;
            break;
        case "/":
            if (n2 == 0) {
                System.out.println("Denominador não pode ser igual a zero.");
                sc.close();
                return;
            }
            n3 = n1 / n2;
            break;
        }

        System.out.println("RESULTADO = " + n3);
        sc.close();
    }
}

package AprendendoCondicoesJava.src;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        
        double num1 = 0d;
        double num2 = 0d;
        double resultado = 0d;

        String operacao = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        num1 = scanner.nextDouble();
        System.out.println("Insira o segundo número: ");
        num2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Insira abaixo a operação desejada 'Não utilize simbibolos como ç ou ã': (+)soma, (-)subtracao, (*)multiplicacao, divisao: ");
        operacao = scanner.nextLine();

        if(operacao.equals("soma") || operacao.equals("+") || operacao.equals("Soma")){
            resultado = num1 + num2;
            System.out.println("O resultado de " + num1 + " " + operacao + " " + num2 + " é " + resultado);
        }else if(operacao.equals("subtracao") || operacao.equals("-") || operacao.equals("Subtracao")){
            resultado = num1 - num2;
            System.out.println("O resultado de " + num1 + " " + operacao + " " + num2 + " é " + resultado);
        }else if(operacao.equals("multiplicacao") || operacao.equals("*") || operacao.equals("Multiplicacao")){
            resultado = num1 * num2;
            System.out.println("O resultado de " + num1 + " " + operacao + " " + num2 + " é " + resultado);
        }else if(operacao.equals("divisao") || operacao.equals("/") || operacao.equals("Divisao")){
            resultado = num1 / num2;
            System.out.println("O resultado de " + num1 + " " + operacao + " " + num2 + " é " + resultado);
        }else{
            System.out.println("Insira informações validas!!!");
        }
    }
}
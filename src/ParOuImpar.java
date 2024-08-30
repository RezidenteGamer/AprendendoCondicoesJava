package AprendendoCondicoesJava.src;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero = 0d;

        System.out.println("Digite um número para saber se ele é par ou ímpar: ");
        numero = scanner.nextDouble();

        // "%" é uma forma de conseguir com que o resto da divisão seja considerado, ou seja o MOD(Módulo), então se 2 % 2 = 2.0 esse calculo ira considerear apenas o numero 0
        // e no caso de 2 % 3 = 0.66 então ira considerar o numero 66

        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é par");
        }else if(numero % 2 == 1){
            System.out.println("O número " + numero + " é ímpar");
        }

    }
}

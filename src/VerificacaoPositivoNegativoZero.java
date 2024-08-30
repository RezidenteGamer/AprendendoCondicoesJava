package AprendendoCondicoesJava.src;

import java.util.Scanner;

public class VerificacaoPositivoNegativoZero {
    public static void main(String[] args) {
        
        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número para saber se ele é positivo ou negativo ou zero: ");
        numero = scanner.nextInt();

        if(numero % 2 == 0 && numero != 0){
            System.out.println("O número " + numero + " é POSITIVO");
        }else if(numero % 2 > 0){
            System.out.println("O número " + numero + " é NEGATIVO");
        }else{
            System.out.println("O número inserido é ZERO");
        }
    }
}

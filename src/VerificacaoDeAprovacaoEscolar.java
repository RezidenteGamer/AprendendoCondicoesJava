package AprendendoCondicoesJava.src;

import java.util.Scanner;

public class VerificacaoDeAprovacaoEscolar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double n1, n2, media;

        System.out.println("Digite a nota do 1º bimestre: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite a nota do 2º bimestre: ");
        n2 = scanner.nextDouble();

        media = (n1 + n2) / 2;

        if (media >= 6) {
            System.out.println("Parabéns, você passou!");
        } else {
            System.out.println("Você deve fazer a prova substitutiva!");

            System.out.println("Digite a nota da prova substitutiva: ");
            double substitutiva = scanner.nextDouble();

            if (substitutiva > n1 && substitutiva < n2) {
                n1 = substitutiva;
            } else if (substitutiva < n1 && substitutiva > n2) {
                n2 = substitutiva;
            }

            media = (n1 + n2) / 2;

            if (media >= 6) {
                System.out.println("Parabéns, você passou!");
            } else {
                System.out.println("Você reprovou com média " + media);
            }
        }

    }
}
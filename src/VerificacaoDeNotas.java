package AprendendoCondicoesJava.src;

import java.util.Scanner;

public class VerificacaoDeNotas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double nota = 0d;

        System.out.println("Digite sua nota");
        nota = scanner.nextDouble();

        if(nota >= 9){
            System.out.println("Sua nota " + nota + " é excelente");
        }else if(nota >= 7){
            System.out.println("Sua nota " + nota + " é bom");
        }else if(nota >= 5){
            System.out.println("Sua nota " + nota + " é satifatória");
        }else if(nota < 5){
            System.out.println("Sua nota " + nota + " é insatisfatória");
        }

        }

    }
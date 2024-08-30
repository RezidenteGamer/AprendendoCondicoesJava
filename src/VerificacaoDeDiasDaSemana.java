package AprendendoCondicoesJava.src;

import java.util.Scanner;

public class VerificacaoDeDiasDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int diasSemana = 0;


    System.out.println("Escolha um dia da semana entre 1 e 7");
    diasSemana = scanner.nextInt();

        switch (diasSemana) {
                case 1:
            System.out.println("Você escolheu DOMINGO!");                
                break;
                case 2:
            System.out.println("Você escolheu SEGUNDA!");      
                break;
                case 3:
            System.out.println("Você escolheu TERÇA!"); 
                break;
                case 4:
            System.out.println("Você escolheu QUARTA!");
                break;
                case 5:
            System.out.println("Você escolheu QUINTA!");
                break;
                case 6:
            System.out.println("Você escolheu SEXTA!");
                break;
                case 7:
            System.out.println("Você escolheu SÁBADO!");
                break;
                
            default:
            System.out.println("Você escolheu uma data inválida!");
                break;
        }

    }
    
}

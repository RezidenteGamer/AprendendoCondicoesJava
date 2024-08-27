package AprendendoCondicoesJava.src;

import java.util.Scanner;

public class ExemploCondicoesJava {

    //Quero adicionar um desconto gradativo
    // Valor Maior que 1000 - 10%
    // Valor Maior que 2000 - 20%
    // Valor Maior que 3000 - 30%
    // Valor menor ou igual a 1000 - 0%

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     System.out.println("Digite o valor do produto: ");
     
     double valorBruto = scanner.nextDouble(); 
        double desconto = 0d;

        if(valorBruto >= 1000){
             desconto = valorBruto * 0.10;
        }else if(valorBruto >= 2000){
             desconto = valorBruto * ( 20. / 100);
        }else if(valorBruto >= 3000){
             desconto = valorBruto * ( 30. / 100 );
        }else{
          desconto = 0;
        }

        System.out.println("Valor Bruto é: " + valorBruto);
        System.out.println("Valor do desconto é: " + desconto);
        System.out.println("Valor Liquido é: " + (valorBruto - desconto));
        scanner.close();


    }
    
}
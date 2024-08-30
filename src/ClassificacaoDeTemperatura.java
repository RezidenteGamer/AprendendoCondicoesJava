package AprendendoCondicoesJava.src;

import java.util.Scanner;

public class ClassificacaoDeTemperatura {
    public static void main(String[] args) {

        int temperatura;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura: ");
        temperatura = scanner.nextInt();

        if(temperatura >= 30 ){
            System.out.println("Está quente");
        }else if(30 > temperatura && temperatura > 15){
            System.out.println("Está agradável");
        }else if(temperatura < 15){
            System.out.println("Está frio");
        }else{
            System.out.println("Insira informações válidas!");
        }
    }
}

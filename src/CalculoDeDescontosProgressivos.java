package AprendendoCondicoesJava.src;

import java.util.Scanner;

public class CalculoDeDescontosProgressivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorBruto;
        double desconto = 0d;
        double valorLiquido = 0d;
        String descontoValor = "0%";

        System.out.println("Insira o valor das compras: ");
        valorBruto = scanner.nextDouble();

        if(valorBruto >= 500.){
            desconto = (valorBruto * 0.20);
            valorLiquido = valorBruto - desconto;
            descontoValor = "20%";
        }else if(valorBruto < 500. && valorBruto >= 200.){
            desconto = valorBruto * 0.10;
            descontoValor = "10%";
            valorLiquido = valorBruto - desconto;
        }else if(valorBruto <= 199.99 && valorBruto >= 100.){
            desconto = valorBruto * 0.05;
            valorLiquido = valorBruto - desconto;
            descontoValor = "5%";
        }else{
            System.out.println("O produto não possuí desconto!");
        }

        System.out.println("Valor original: R$" + valorBruto);
        System.out.println("Desconto: " + descontoValor);
        System.out.println("Valor descontado: R$" + desconto);
        System.out.println("Valor com desconto R$" + valorLiquido);

    }
}

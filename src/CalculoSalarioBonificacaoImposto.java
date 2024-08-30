package AprendendoCondicoesJava.src;

import java.util.Scanner;

public class CalculoSalarioBonificacaoImposto {
    public static void main(String[] args) {

        String funcionario;
        double salarioBruto;
        double salarioLiquido;
        double bonus = 0d;
        double imposto = 0d;
        int anos;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome do funcionário: ");
        funcionario = scanner.nextLine();
        System.out.println("Insira o salário do funcionário: ");
        salarioBruto = scanner.nextDouble();
        System.out.println("Insira quantos anos o funcionário trabalhou: ");
        anos = scanner.nextInt();

        if(anos >= 10){
            bonus = salarioBruto * 0.10;   
        }else if(anos < 10 && anos > 5){
            bonus = salarioBruto * 0.05;
        }

        if(salarioBruto >= 5000){
            imposto = salarioBruto * 0.27;
        }else if(salarioBruto >= 3000 && salarioBruto < 4999.99 ){
            imposto = salarioBruto * 0.18;
        }else if(salarioBruto < 3000){
            imposto = salarioBruto * 0.10;
        }
        
        salarioLiquido = salarioBruto - imposto + bonus;

        System.out.println("Funcionário: " + funcionario);
        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("Bônus: R$" + bonus);
        System.out.println("Imposto: R$" + imposto);
        System.out.println("Salário líquido: R$" + salarioLiquido);

    }
}

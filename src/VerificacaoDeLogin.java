package AprendendoCondicoesJava.src;

import java.util.Scanner;

public class VerificacaoDeLogin {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String usuario = "Bruno";
        String senhaUser = "906030";

        String nome = "";
        String senha = "";

        System.out.println("Insira o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Insira sua senha: ");
        senha = scanner.nextLine();

        if(nome.equals(usuario) && senha.equals(senhaUser)){
            System.out.println("Acesso concedido!");
        }else{
            System.out.println("Acesso negado (comunique o suporte)");
        }

    }
}

import java.util.Scanner;

public class VerificacaoDeMaioridade{

public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    
    int idade = 0;

    System.out.println("Escreva a idade: ");
    idade = scanner.nextInt();

    if(idade >= 18){
        System.out.println("Você é maior de idade");
    }else if(idade < 18 && idade > 10){
        System.out.println("Você é adolescente");
    }else if(idade < 10){
        System.out.println("Você é criança");
    }else{
        System.out.println("Insira uma idade valida");
    }


}

}
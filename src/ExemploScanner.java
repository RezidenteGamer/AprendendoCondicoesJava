import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome = " ";
        Integer idade = 0;
        Double peso = 0.0;

        System.out.println("Escreva seu nome: ");
        nome = sc.next();

        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

        System.out.println("Informe o seu peso: ");
        peso = sc.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);

    }
    
}
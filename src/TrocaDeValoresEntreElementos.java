import java.util.Scanner;

public class TrocaDeValoresEntreElementos{

public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int valores[] = {5, 10};

    String troca= "";

    System.out.println("Os valores atualmente são " + valores[0] + " e " + valores[1]);

    System.out.println("Digite 'trocar' quando quiser trocar os valores!");
    troca = scanner.nextLine();

    if(troca.equals("trocar")){

        valores[0] = 10;
        valores[1] = 5;
        System.out.println("Os valores atualmente são " + valores[0] + " e " + valores[1]);
    }
    else{
        System.out.println("Erro");
    }




}
}
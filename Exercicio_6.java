import java.util.Scanner;

public class Exercicio_6{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um ano para verificar se é bissexto ou não : ");
        int ano = scanner.nextInt();

        String resultado = ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) ? " é bissexto" :  "não é bissexto";

        System.out.println("O ano de "+ano+ "" +resultado);

        scanner.close();
    }
}
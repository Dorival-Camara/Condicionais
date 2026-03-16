import java.util.Scanner;

public class Exercicio_10{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número : ");
        int numero = scanner.nextInt();

        String resultado = (numero < 0) ? " é negativo" : (numero == 0)? "nulo" : "positivo";

        System.out.println("O numero : " +numero+ " é "+resultado);

        scanner.close();
    }
}
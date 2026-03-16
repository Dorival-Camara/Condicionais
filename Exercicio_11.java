import java.util.Scanner;

public class Exercicio_11{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma idade : ");
        int idade = scanner.nextInt();

        double resultado = (idade <= 12) ? 10.0 : (idade > 12 && idade < 60)? 20.0 : 10.0;

        System.out.println("Essa pessoa de : " +idade+ " irá pagar R$"+resultado);

        scanner.close();
    }
}
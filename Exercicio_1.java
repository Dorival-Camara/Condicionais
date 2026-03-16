import java.util.Scanner;

public class Exercicio_1{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número : ");
        int numero = scanner.nextInt();

        String resultado = (numero % 2 == 0) ? "par" : "impar";
            System.out.println("O número : " +numero+ " É : " +resultado);
        
        scanner.close();
    }
}
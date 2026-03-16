import java.util.Scanner;

public class Exercicio_2{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número : ");
        int n1 = scanner.nextInt();

        System.out.println("Informe outro número : ");
        int n2 = scanner.nextInt();


        int resultado = (n1 > n2) ? n1 : n2;
            System.out.println("O maior número é o : " +resultado);
        
        scanner.close();
    }
}
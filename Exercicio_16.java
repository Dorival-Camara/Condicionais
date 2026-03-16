import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        String resultado =(numero % 3 == 0 && numero % 5 == 0) ? "É múltiplo de 3 e de 5." : (numero % 3 == 0) ? "É múltiplo apenas de 3." : (numero % 5 == 0) ? "É múltiplo apenas de 5." : "Não é múltiplo de 3 nem de 5.";
        
        System.out.println(resultado);

        scanner.close();
    }
}
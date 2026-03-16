import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.print("Informe o terceiro número: ");
        int n3 = scanner.nextInt();

        int maior = n1;

        if (n2 > maior) {
            maior = n2;
        }

        if (n3 > maior) {
            maior = n3;
        }

        if ((n1 == maior && n2 == maior) ||(n1 == maior && n3 == maior) ||(n2 == maior && n3 == maior)) {

            if (n1 == n2 && n2 == n3) {
                System.out.println("Os três números são iguais.");
            } else {
                System.out.println("Empate no maior valor: " + maior);
            }

        } else {
            System.out.println("O maior número é: " + maior);
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro lado do triângulo : ");
        double l1 = scanner.nextDouble();

        System.out.print("Informe o segundo lado do triângulo : ");
        double l2 = scanner.nextDouble();

        System.out.print("Informe o terceiro lado do triângulo: ");
        double l3 = scanner.nextDouble();

        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {

            if (l1 == l2 && l2 == l3) {
                System.out.println("Triângulo válido: Equilátero.");
            } 
            else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Triângulo válido: Isósceles.");
            } 
            else {
                System.out.println("Triângulo válido: Escaleno.");
            }

        } else {
            System.out.println("Os valores informados não formam um triângulo válido!!");
        }

        scanner.close();
    }
}
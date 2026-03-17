import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a velocidade do veículo: ");
        double velocidade = scanner.nextDouble();

        System.out.print("Informe o limite da via: ");
        double limite = scanner.nextDouble();

        if (velocidade <= limite) {
            System.out.println("Sem multa");
        } else {

            double percentual = ((velocidade - limite) / limite) * 100;

            if (percentual <= 20) {
                System.out.println("Multa leve");
            }
            else if (percentual <= 50) {
                System.out.println("Multa grave");
            }
            else {
                System.out.println("Multa gravíssima + suspensão");
            }
        }

        scanner.close();
    }
}
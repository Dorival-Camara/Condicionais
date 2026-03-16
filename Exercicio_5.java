import java.util.Scanner;

public class Exercicio_5{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número : ");
        double n1 = scanner.nextDouble();

        System.out.println("Informe um segundo número : ");
        double n2 = scanner.nextDouble();

        System.out.println("Informe um operador sendo 1- (+), 2- (-), 3- (*), 4- (/) :  ");
        int operador = scanner.nextInt();

        double adicao = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1/n2;

        switch (operador) {
    case 1:
        System.out.println("Resultado : " +adicao);
        break;
    case 2:
        System.out.println("Resultado : " +subtracao);
        break;
    case 3:
        System.out.println("resultado : " +multiplicacao);
        break;
    default:
            if (n2 != 0) {
                System.out.println("Resultado: " +divisao);
            } else {
                System.out.println("Erro: divisão por zero não é permitida.");
            }
            break;
}
    scanner.close();

    }
}
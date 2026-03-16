import java.util.Scanner;

public class Exercicio_3{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma nota : ");
        double n1 = scanner.nextDouble();

        System.out.println("Informe uma segunda nota : ");
        double n2 = scanner.nextDouble();

        System.out.println("Informe a ultima nota : ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        String resultado = (media >= 7.0) ? "Aprovado" :  (media >= 5.0) ? "Recuperação" : "Reprovado";

        System.out.println("A média desse aluno foi de : " +media+ " fazendo-o ser : " +resultado);

        scanner.close();
    }
}
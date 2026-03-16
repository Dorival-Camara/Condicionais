import java.util.Scanner;

public class Exercicio_12{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma nota : ");
        double nota = scanner.nextDouble();

        String resultado = (nota >= 9) ? "(A)" :  (nota >= 7 && nota <= 8) ? "(B)" : (nota >= 5 && nota <=6) ? "(C)" : "(D)";

        System.out.println("A nota desse aluno foi : " +nota+ " fazendo-o receber : " +resultado);

        scanner.close();
    }
}
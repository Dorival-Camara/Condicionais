import java.util.Scanner;

public class Exercicio_4{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma temperatura em Celcius : ");
        double temperatura = scanner.nextDouble();

        String clima = (temperatura < 15) ? "frio" :  (temperatura >= 15 && temperatura <= 25) ? "agradável" : "quente";

        System.out.println("A temperatura é de : " +temperatura+ "°C tornando o clima " +clima);

        scanner.close();
    }
}
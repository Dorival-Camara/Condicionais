import java.util.Scanner;

public class Exercicio_8{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu peso : ");
        double peso = scanner.nextDouble();

        System.out.println("Informe sua altura : ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String resultado = (imc < 18.5) ? "abaixo de peso" : (imc <= 25) ? "peso normal" : (imc > 25 && imc < 30) ? "Acima do peso" : "Obeso";

        System.out.println("O seu peso é de :  "+peso+ " e sua altura é de : "+altura+ " você está : " +resultado);

        scanner.close();
    }
}
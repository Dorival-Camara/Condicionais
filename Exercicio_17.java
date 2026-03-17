import java.util.Scanner;

public class Exercicio_17{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da sua compra : ");
        double compra = scanner.nextDouble();

        double desconto1 = compra * 0.20;
        double desconto2 = compra * 0.10;

        double valorFinal = (compra > 500.0) ? desconto1 : (compra >= 200 && compra <= 500) ? desconto2 : 0.00 ;

        System.out.println("A compra no valor de : R$" +compra+ " teve um desconto de : R$" +valorFinal);

        if(valorFinal == desconto1){
            double total = compra - desconto1;
            System.out.println("O valor total da compra foi de : " +total);
        }
        else if(valorFinal == desconto2){
            double total2 = compra - desconto2;
            System.out.println("O valor total da compra foi de : " +total2);
        }
        else{
            System.out.println("O valor total foi de : " +compra);
        }

        scanner.close();
    }
}
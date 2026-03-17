import java.util.Scanner;

public class Exercicio_18{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de 1 a 10 : ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 10){
            switch (numero) {
    case 1:
        System.out.println("I");
        break;
    case 2:
        System.out.println("II");
        break;
    case 3:
        System.out.println("III");
        break;
    case 4:
        System.out.println("IV");
        break;
    case 5:
        System.out.println("V");
        break;   
    case 6:
        System.out.println("VI");
        break;
    case 7:
        System.out.println("VII");
        break;
    case 8:
        System.out.println("VIII");
        break;
    case 9:
        System.out.println("IX");
        break;
    default:
        System.out.println("X");     
}
        }
        else{
            System.out.println("Número inválido! Escolha um entre 1 e 10. ");
        }

        scanner.close();
    }
}


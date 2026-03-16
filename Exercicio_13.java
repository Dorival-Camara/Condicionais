import java.util.Scanner;

public class Exercicio_13{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número do mês de 1 a 12 : ");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12){
            switch (mes) {
    case 1:
        System.out.println("Verão");
        break;
    case 2:
        System.out.println("Verão");
        break;
    case 3:
        System.out.println("Outono");
        break;
    case 4:
        System.out.println("Outono");
        break;
    case 5:
        System.out.println("Outono");
        break;   
    case 6:
        System.out.println("Inverno");
        break;
    case 7:
        System.out.println("Inverno");
        break;
    case 8:
        System.out.println("Inverno");
        break;
    case 9:
        System.out.println("Primavera");
        break;
    case 10:
        System.out.println("Primavera");
        break;
    case 11:
        System.out.println("Primavera");
        break;
    default:
        System.out.println("Verão");        
}
        }
        else{
            System.out.println("Mês inválido! Escolha um entre 1 e 12. ");
        }

        scanner.close();
    }
}


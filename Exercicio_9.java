import java.util.Scanner;

public class Exercicio_9{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um dia da semana de 1 a 7 : ");
        int dia = scanner.nextInt();

        if (dia >= 1 && dia <= 7){
            switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    case 4:
        System.out.println("Quarta-feira");
        break;
    case 5:
        System.out.println("Quinta-feira");
        break;
    case 6:
        System.out.println("Sexta-feira");
        break;
    default: 
        System.out.println("Sábado");        
}
        }
        else{
            System.out.println("Dia inválido! Escolha um entre 1 e 7. ");
        }

        scanner.close();
    }
}


import java.util.Scanner;

public class Exercicio_21{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        char[][] cadeiras = new char[12][12];
        int opcao;

        for(int i = 0; i < 12; i++){
            for(int c = 0; c < 12; c++){
                cadeiras[i][c] = 'L';
                
            }
        }

        do{
        System.out.println("---------------------------");
        System.out.println("Seja bem vindo ao teatro");
        System.out.println("---------------------------");   
        System.out.println("1- Cadastro de sala : ");
        System.out.println("2- Exibir mapa da plateia : ");
        System.out.println("3- Reservar assento : ");
        System.out.println("4- Comprar assento : ");
        System.out.println("5- Relatório financeiro : ");
        System.out.println("0- finalizar : ");
        System.out.println("\nDigite a opção desejada : ");
        opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                break;

            case 2:
                break;

            case 3:
                for(int i = 0; i < 12; i++){
            for(int c = 0; c < 12; c++){
                if(cadeiras[i][c] == 'L'){
                    System.out.print("[ ]");
                }  
                else if(cadeiras[i][c] == 'R'){
                    System.out.print("[R]");
                }
                else{
                    System.out.print("[X]");
                }
            }
            System.out.println();
        }
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;                        
        }
        

        }while(opcao != 0);

    }
}

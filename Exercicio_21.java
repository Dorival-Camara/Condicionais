import java.util.Scanner;

public class Exercicio_21{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da sala : ");
        String nomeSala = scanner.nextLine();

        System.out.println("Digite o nome do espetaculo");
        String nomeEspetaculo = scanner.nextLine();

        char[][] cadeiras = new char[12][12];

        for(int i = 0; i < 12; i++){
            for(int c = 0; c < 12; c++){
                cadeiras[i][c] = 'L';
                
            }
        }
        
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

    }
}

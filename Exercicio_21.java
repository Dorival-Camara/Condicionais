import java.util.Scanner;

public class Exercicio_21{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int nomeSala;

        do{
        System.out.println("Escolha uma sala sendo 1- (mítica), 2- (Natureza), 3- (Contemporâneo) : ");
        int nomeSala = scanner.nextInt();
        } while (nomeSala < 1 && nomeSala < 4);
        
        if (nomeSala == 1){
            System.out.println("Escolha um espetáculo sendo 1- (Harry Potter), 2-(Star Wars) e 3- (Vingadores)");
            int nomeEspetaculo = scanner.nextInt();
        }
        else if (nomeSala == 2){
            System.out.println("Ecolha um espetáculo sendo 1- (Zootopia), 2- (Animal Planet) e 3- (Monstros dos rios)");
            int nomeEspetaculo = scanner.nextInt();
        }
        else if (nomeSala == 3){
            System.out.println("Escolha um espetáculo sendo 1- (Mozart), 2- (Beethoven) e 3- (Hans Zimmer)");
            int nomeEspetaculo = scanner.nextInt();
        }
        else{
            System.out.println("Erro escolha uma opção válida!!");
        }

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

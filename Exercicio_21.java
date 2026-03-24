import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] cadeiras = new char[12][12];
        int opcao;
        int opcaoSala = 0;
        int opcaoEspetaculo = 0; 

        for (int i = 0; i < 12; i++) {
            for (int c = 0; c < 12; c++) {
                cadeiras[i][c] = 'L';
            }
        }

        do {
            System.out.println("---------------------------");
            System.out.println("Seja bem vindo ao teatro");
            System.out.println("---------------------------");
            System.out.println("1- Cadastro de sala");
            System.out.println("2- Exibir mapa da plateia");
            System.out.println("3- Reservar assento");
            System.out.println("4- Comprar assento");
            System.out.println("5- Relatório financeiro");
            System.out.println("0- Finalizar");
            System.out.print("\nDigite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha uma opção de sala sendo 1 - (musical), 2- (Ficção) e 3- (Stand-up) : ");
                    opcaoSala = scanner.nextInt();
                    if(opcaoSala == 1){
                        System.out.println("Escolha um espetáculo, 1- (Bethoveen), 2- (Hans Zimmer) e 3- (Mozart) :");
                        opcaoEspetaculo = scanner.nextInt();
                    }
                    else if(opcaoSala == 2){
                        System.out.println("Escolha um espetáculo, 1- (Star Wars), 2- (Harry Potter) e 3- (Vingadores) :");
                        opcaoEspetaculo = scanner.nextInt();
                    }
                    else if(opcaoSala == 3){
                        System.out.println("Escolha um espetáculo, 1- (Whindersson Nunes), 2- (Rafael Aragão) e 3- (Thiago Ventura) : ");
                        opcaoEspetaculo = scanner.nextInt();
                    }
                    else{
                        System.out.println("Opção inválida!!");
                    }
                    break;

                case 2:
                    if(opcaoSala == 0 || opcaoEspetaculo == 0){
                        System.out.println("Cadastre a sala primeiro!!");
                    }
                    else{
                    
                    if(opcaoSala == 1){
                        if(opcaoEspetaculo == 1){
                            System.out.println("Sala Escolhida : Musical\nEspetáculo escolhido : Beethoven");
                        }
                        else if(opcaoEspetaculo == 2){
                            System.out.println("Sala Escolhida : Musical\nEspetáculo escolhido : Hans Zimmer");
                        }                   
                        else if(opcaoEspetaculo == 3){
                            System.out.println("Sala Escolhida : Musical\nEspetáculo escolhido : Mozart");
                        }
                    }
                    else if(opcaoSala == 2){
                        if(opcaoEspetaculo == 1){
                            System.out.println("Sala Escolhida : Ficção\nEspetáculo escolhido : Star Wars");
                        }
                        else if(opcaoEspetaculo == 2){
                            System.out.println("Sala Escolhida : Ficção\nEspetáculo escolhido : Harry Potter");
                        }
                        else if(opcaoEspetaculo == 3){
                            System.out.println("Sala Escolhida : Ficção\nEspetáculo escolhido : Vingadores");
                        }
                    }
                    else if(opcaoSala == 3){
                        if(opcaoEspetaculo == 1){
                            System.out.println("Sala Escolhida : Stand-Up\nEspetáculo escolhido : Whindersson Nunes");
                        }
                        else if(opcaoEspetaculo == 2){
                            System.out.println("Sala Escolhida : Stand-Up\nEspetáculo escolhido : Rafael Aragão");
                        }
                        else if(opcaoEspetaculo == 3){
                            System.out.println("Sala Escolhida : Stand-Up\nEspetáculo escolhido : Thiago Ventura");
                        }
                    }
                    
                    System.out.println("      A  B  C  D  E  F  G  H  I  J  K  L");

                    for (int i = 0; i < 12; i++) {
                        int numeroLinha = i + 1;

                        if (numeroLinha < 10) {
                            System.out.print(" " + numeroLinha + " | ");
                        } else {
                            System.out.print(numeroLinha + " | ");
                        }

                        for (int c = 0; c < 12; c++) {
                            if (cadeiras[i][c] == 'L') {
                                System.out.print("[ ]");
                            } else if (cadeiras[i][c] == 'R') {
                                System.out.print("[R]");
                            } else {
                                System.out.print("[X]");
                            }
                        }
                        System.out.println();
                    }
                }
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
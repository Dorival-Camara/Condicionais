import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        System.out.print("Jogador 1 escolha: ");
        int j1 = scanner.nextInt();

        System.out.print("Jogador 2 escolha: ");
        int j2 = scanner.nextInt();

        if (j1 < 1 || j1 > 3 || j2 < 1 || j2 > 3) {
            System.out.println("Opção inválida!");
        } 
        else {

            String resultado;

            if (j1 == j2) {
                resultado = "Empate";
            }
            else if ((j1 == 1 && j2 == 3) || (j1 == 3 && j2 == 2) || (j1 == 2 && j2 == 1)
            ) {
                resultado = "Jogador 1 venceu";
            }
            else {
                resultado = "Jogador 2 venceu";
            }

            System.out.println(resultado);
        }

        scanner.close();
    }
}
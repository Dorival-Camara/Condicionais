import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Jogador 1 (pedra, papel ou tesoura): ");
        String j1 = scanner.nextLine().toLowerCase();

        System.out.print("Jogador 2 (pedra, papel ou tesoura): ");
        String j2 = scanner.nextLine().toLowerCase();

        String resultado;

        if (j1.equals(j2)) {
            resultado = "Empate";
        }
        else if ((j1.equals("pedra") && j2.equals("tesoura")) || (j1.equals("tesoura") && j2.equals("papel")) || (j1.equals("papel") && j2.equals("pedra"))
        ) {
            resultado = "Jogador 1 venceu";
        }
        else {
            resultado = "Jogador 2 venceu";
        }

        System.out.println(resultado);

        scanner.close();
    }
}
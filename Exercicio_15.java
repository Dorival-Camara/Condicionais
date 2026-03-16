import java.util.Scanner;

public class Exercicio_15{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome de usuário: ");
        String usuario = scanner.nextLine();

        System.out.println("Informe a senha em números: ");
        int senha = scanner.nextInt();

        String a = "dorival";

        String login = 
            (a.equals(usuario) && senha == 25156) ? "Acesso liberado" : "Acesso negado";

        System.out.println(login);

        scanner.close();
    }
}
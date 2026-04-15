import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa user = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        user.setNome(scanner.nextLine());
        System.out.println("Hello and welcome, "+ user.getNome() +"! Vamos aprender a contar? Digite 1 para SIM e 0 para NÃO");
        int resposta = scanner.nextInt();
        if (resposta == 1) {
            System.out.println("Qual sua idade?");
            user.setIdade(scanner.nextInt());
            for (int i = 1; i <= user.getIdade(); i++) {
                if (i == user.getIdade()) {
                    System.out.println(i + "!");
                    return;
                }
                System.out.print(i + ", ");
            }
        } else {
            System.out.println("Ok " + scanner.nextLine() + "! Tenha uma ótima noite!");
        }

    }
}
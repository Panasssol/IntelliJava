import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Hello and welcome, "+ nome +"! Vamos aprender a contar? Digite 1 para SIM e 0 para NÃO");
        int resposta = scanner.nextInt();
        if (resposta == 1) {
            System.out.println("Qual sua idade?");
            int idade = scanner.nextInt();
            for (int i = 1; i <= idade; i++) {
                if (i == idade) {
                    System.out.println(i + "!");
                    return;
                }
                System.out.print(i + ", ");
            }
        } else {
            System.out.println("Ok " + nome + "! Tenha uma ótima noite!");
        }

    }
}
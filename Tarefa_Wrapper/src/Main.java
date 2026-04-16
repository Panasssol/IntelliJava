import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();
        System.out.println("Insira um valor");
        conversor.converteWrapper(scanner.nextInt());
    }
}
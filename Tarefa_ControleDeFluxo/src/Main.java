import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Notas notas = new Notas();

        System.out.println("Digite o valor da nota 1");
        notas.setNota1(Float.parseFloat(scanner.nextLine()));
        System.out.println("Digite o valor da nota 2");
        notas.setNota2(Float.parseFloat(scanner.nextLine()));
        System.out.println("Digite o valor da nota 3");
        notas.setNota3(Float.parseFloat(scanner.nextLine()));
        System.out.println("Digite o valor da nota 4");
        notas.setNota4(Float.parseFloat(scanner.nextLine()));

        if(notas.calculoMedia()>=7){
            System.out.println("Aprovado");
        } else if (notas.calculoMedia()>=5 && notas.calculoMedia()<7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
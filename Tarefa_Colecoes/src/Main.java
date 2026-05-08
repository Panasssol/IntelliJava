import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("//ORDENAMENTO DE NOMES//");
        System.out.println("Digite nomes separados por virgula");
        String nomes = scanner.nextLine();
        String[] nomesSplit = nomes.split(",");
        Arrays.sort(nomesSplit);
        for (int i = 0; i < nomesSplit.length; i++) {
            System.out.println(nomesSplit[i]);
        }

        System.out.println("//SEPARAÇÃO POR GRUPOS//");
        String nome;
        String sexo;
        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();
        System.out.println("Digite nomes/sexo(M, F) separados por virgula");
        String pessoas = scanner.nextLine();
        String[] pessoa = pessoas.split(",");
        for(int i=0; i < pessoa.length ;i++){
            String[] nomeSexo = pessoa[i].split("/");
            nome = nomeSexo[0];
            sexo = nomeSexo[1];
            if(nomeSexo[1].equals("M")){
                homens.add(nome);
            } else {
                mulheres.add(nome);
            }
        }
        System.out.println("Lista homens");
            System.out.println(homens);

        System.out.println("Lista mulheres");
            System.out.println(mulheres);
    }
}
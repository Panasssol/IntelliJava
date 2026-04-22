import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        List<Pessoa> listaHomens = new ArrayList<Pessoa>();
        List<Pessoa> listaMulheres = new ArrayList<Pessoa>();

        Pessoa pessoaA = new Pessoa("Matheus", "Homem");
        listaPessoas.add(pessoaA);
        Pessoa pessoaB = new Pessoa("Ana", "Mulher");
        listaPessoas.add(pessoaB);
        Pessoa pessoaC = new Pessoa("João", "Homem");
        listaPessoas.add(pessoaC);
        Pessoa pessoaD = new Pessoa("Isadora", "Mulher");
        listaPessoas.add(pessoaD);
        Pessoa pessoaE = new Pessoa("Arthur", "Homem");
        listaPessoas.add(pessoaE);
        Pessoa pessoaF = new Pessoa("Mariana", "Mulher");
        listaPessoas.add(pessoaF);

        for (int i = 0; i < listaPessoas.size(); i++){
            if (listaPessoas.get(i).getSexo().equals("Homem")){
                listaHomens.add(listaPessoas.get(i));
            } else {
                listaMulheres.add(listaPessoas.get(i));
            }
        }

        System.out.println("Lista de homens");
        for (int i = 0; i < listaHomens.size(); i++) {
            System.out.println(listaHomens.get(i).getNome());
        }

        System.out.println("Lista de mulheres");
        for (int i = 0; i < listaMulheres.size(); i++) {
            System.out.println(listaMulheres.get(i).getNome());
        }

        //Exemplos de implementação de lista
        /*//List<Tipo da lista> nomedalista = new ArrayList<Tipo da lista>();
        List<Double> listaNumeros = new ArrayList<Double>();
        listaNumeros.add(1.0);
        listaNumeros.add(3.0);
        listaNumeros.add(11.0);
        listaNumeros.add(4.0);
        listaNumeros.add(2.1);
        listaNumeros.add(2.0);
        System.out.println("Lista de numeros não ordenada");
        System.out.println(listaNumeros);

        System.out.println("Lista de numeros ordenada");
        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);

        List<String> listaNomes = new ArrayList<String>();
        listaNomes.add("Matheus");
        listaNomes.add("Panassol");
        listaNomes.add("DEF");
        listaNomes.add("ABC");
        System.out.println("Lista de nomes não ordenada");
        System.out.println(listaNomes);

        System.out.println("Lista de nomes ordenada");
        Collections.sort(listaNomes);
        System.out.println(listaNomes);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        Pessoa a = new Pessoa("Matheus Panassol", 26, "Rua 123 N°456", "Ciencia da computação");
        Pessoa b = new Pessoa("Antonio", 50, "Rua 000 N°000", "Medicina");
        Pessoa c = new Pessoa("Fulano", 16, "Rua 987 N°654", "Engenharia de software");
        pessoas.add(a);
        pessoas.add(b);
        pessoas.add(c);
        System.out.println("Lista de pessoas não ordenada");
        System.out.println(pessoas);

        Collections.sort(pessoas);
        System.out.println("Lista de pessoas ordenada pelo nome");
        System.out.println(pessoas);*/


    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //List<Tipo da lista> nomedalista = new ArrayList<Tipo da lista>();
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
    }
}
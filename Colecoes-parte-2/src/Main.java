import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<Tipo da lista> nomedalista = new ArrayList<Tipo da lista>();
        List<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(1);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(2);
        System.out.println(listaNumeros);

        List<String> listaNomes = new ArrayList<String>();
        listaNomes.add("Matheus");
        listaNomes.add("Panassol");
        listaNomes.add("DEF");
        listaNomes.add("ABC");
        System.out.println(listaNomes);
    }
}
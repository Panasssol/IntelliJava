import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        System.out.println("Você tem carro?\nSe sim, digite 1\nSe não, digite 0");
        if (scanner.nextInt() == 1) {
            scanner.nextLine(); //Metodo utilizado para consumir o "enter" do nextInt anterior que não foi consumido
            System.out.println("Qual a marca do seu carro?");
            carro.setMarca(scanner.nextLine());
            System.out.println("Qual o modelo do seu carro?");
            carro.setModelo(scanner.nextLine());
            //Caso haja um nextLine após tudo isso, ele será pulado por consumir o "enter" do último nextInt
            //Os nextInt não consomem o "enter" dos últimos nextInt, pois ele só espera valores int
            //Para resolver isso podemos usar Integer.parseInt(scanner.nextLine())
            //Ele irá pegar o valor como forma de texto e converter para int, consumindo o "enter"
            /*System.out.println("Qual o ano do seu carro?");
            carro.setAno(scanner.nextInt());
            System.out.println("Qual a quilometragem do seu carro?");
            carro.setKms(scanner.nextInt());
            System.out.println("Quanto você pagou nele?");
            carro.setValor(scanner.nextInt());*/
            System.out.println("Qual o ano do seu carro?");
            carro.setAno(Integer.parseInt(scanner.nextLine()));
            System.out.println("Qual a quilometragem do seu carro?");
            carro.setKms(Integer.parseInt(scanner.nextLine()));
            System.out.println("Quanto você pagou nele?");
            carro.setValor(Integer.parseInt(scanner.nextLine()));
            System.out.println("Gostaria de ler as informações inseridas?\nSe sim, digite 1\nSe não, digite 0");
            if(Integer.parseInt(scanner.nextLine()) == 1) {
                carro.infosCarro();
            }
        }
    }
}
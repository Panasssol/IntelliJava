import br.com.panassol.generics.estrutura.GaragemGenerica;
import br.com.panassol.generics.modelos.Carro;
import br.com.panassol.generics.modelos.CarroCombustao;
import br.com.panassol.generics.modelos.CarroEletrico;

public class Main {
    public static void main(String[] args) {

        GaragemGenerica<CarroEletrico> garagemEletrica = new GaragemGenerica<>();
        garagemEletrica.adicionarVeiculo(new CarroEletrico("Tesla Model S"));
        garagemEletrica.adicionarVeiculo(new CarroEletrico("BYD Dolphin"));

        garagemEletrica.listarVeiculos();

        GaragemGenerica<Carro> garagemMista = new GaragemGenerica<>();
        garagemMista.adicionarVeiculo(new CarroCombustao("Porsche 911"));
        garagemMista.adicionarVeiculo(new CarroEletrico("Nissan Leaf"));

        garagemMista.listarVeiculos();
    }
}
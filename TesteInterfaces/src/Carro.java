public class Carro implements IAutomovel{
    @Override
    public String getCor() {
        return "Preto";
    }

    @Override
    public int getNRodas() {
        return 4;
    }

    @Override
    public int getVelocidadeMax() {
        return 180;
    }
}

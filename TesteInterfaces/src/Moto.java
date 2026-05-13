public class Moto implements IAutomovel{
    @Override
    public String getCor() {
        return "Vermelha";
    }

    @Override
    public int getNRodas() {
        return 2;
    }

    @Override
    public int getVelocidadeMax() {
        return 300;
    }
}

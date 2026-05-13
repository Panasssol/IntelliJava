public class Caminhao implements IAutomovel{
    @Override
    public String getCor() {
        return "Prata";
    }

    @Override
    public int getNRodas() {
        return 6;
    }

    @Override
    public int getVelocidadeMax() {
        return 80;
    }

    /*@Override
    public void andando() {
        IAutomovel.super.andando();
    }*/
}

public interface IAutomovel {

    public String getCor();
    public int getNRodas();
    public int getVelocidadeMax();

    default void andando(){
        System.out.println("Está em movimento com velocidade máxima de "+getVelocidadeMax());
    }

}

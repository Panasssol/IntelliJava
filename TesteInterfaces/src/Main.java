public class Main {
    public static void main(String[] args) {
        System.out.println("=======CARRO=======");
        IAutomovel carro = new Carro();
            System.out.println(carro.getCor());
            System.out.println(carro.getNRodas());
            System.out.println(carro.getVelocidadeMax());
            carro.andando();
        System.out.println("===================");

        System.out.println("=====CAMINHAO=====");
        IAutomovel caminhao = new Caminhao();
            System.out.println(caminhao.getCor());
            System.out.println(caminhao.getNRodas());
            System.out.println(caminhao.getVelocidadeMax());
            caminhao.andando();
        System.out.println("===================");

        System.out.println("========MOTO=======");
        IAutomovel moto = new Moto();
            System.out.println(moto.getCor());
            System.out.println(moto.getNRodas());
            System.out.println(moto.getVelocidadeMax());
            moto.andando();
        System.out.println("===================");
    }
}
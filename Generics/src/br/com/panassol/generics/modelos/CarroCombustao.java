package br.com.panassol.generics.modelos;

public class CarroCombustao implements Carro{

    private String modelo;

    public CarroCombustao(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " roncando o motor! (Queimando combustível)");
    }

}

package br.com.panassol.generics.modelos;

public class CarroEletrico implements Carro{

    private String modelo;

    public CarroEletrico(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " acelerando silenciosamente... (Bateria em uso)");
    }

}

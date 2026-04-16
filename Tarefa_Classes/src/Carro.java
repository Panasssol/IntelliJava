public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private int kms;
    private int valor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void infosCarro() {
        System.out.println("Aqui estão as informações do seu carro");
        System.out.println("A marca: " + getMarca());
        System.out.println("O modelo: " + getModelo());
        System.out.println("O ano: " + getAno());
        System.out.println("A quilometragem: " + getKms());
        System.out.println("O valor: " + getValor());
    }
}

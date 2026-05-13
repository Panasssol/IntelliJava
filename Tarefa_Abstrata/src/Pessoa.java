public abstract class Pessoa {

    public String nome;
    public String sobrenome;

    public void retornaDados (String nome, String sobrenome, String id){
        System.out.println(nome + " " + sobrenome + " de identificação " + id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}

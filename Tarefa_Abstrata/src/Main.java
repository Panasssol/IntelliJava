public class Main {
    public static void main(String[] args) {

        Fisica pessoaFisica = new Fisica();
        Juridica pessoaJuridica = new Juridica();

        System.out.println("CADASTRO PESSOA FISICA");
        pessoaFisica.setNome("Matheus");
        pessoaFisica.setSobrenome("Panassol");
        pessoaFisica.setCpf("01234567890");

        System.out.println("CADASTRO PESSOA JURIDICA");
        pessoaJuridica.setNome("Matheus");
        pessoaJuridica.setSobrenome("Panassol");
        pessoaJuridica.setCnpj("01234567890123");

        System.out.println("EXIBE PESSOA FISICA");
        pessoaFisica.retornaDados(pessoaFisica.getNome(), pessoaFisica.getSobrenome(), pessoaFisica.getCpf());

        System.out.println("EXIBE PESSOA JURIDICA");
        pessoaJuridica.retornaDados(pessoaJuridica.getNome(), pessoaJuridica.getSobrenome(), pessoaJuridica.getCnpj());
    }
}
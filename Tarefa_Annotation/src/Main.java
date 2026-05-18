public class Main {
    public static void main(String[] args) {

        // 1. Pegamos a referência da classe Cliente
        Class<Cliente> classeCliente = Cliente.class;

        // 2. Verificamos se a anotação @Tabela está presente na classe
        if (classeCliente.isAnnotationPresent(Tabela.class)) {

            // 3. Extraímos a anotação da classe
            Tabela anotacaoTabela = classeCliente.getAnnotation(Tabela.class);

            // 4. Lemos e imprimimos o valor configurado na anotação
            System.out.println("A classe Cliente está mapeada para a tabela: " + anotacaoTabela.value());

        } else {
            System.out.println("A anotação @Tabela não foi encontrada na classe Cliente.");
        }
    }
}
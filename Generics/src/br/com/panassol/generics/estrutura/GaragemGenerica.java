package br.com.panassol.generics.estrutura;

import br.com.panassol.generics.modelos.Carro;

import java.util.ArrayList;
import java.util.List;

public class GaragemGenerica<T extends Carro> {

    // Composição: usamos uma List interna para gerenciar os dados
    private List<T> veiculos;

    public GaragemGenerica() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(T veiculo) {
        veiculos.add(veiculo);
        System.out.println(veiculo.getModelo() + " adicionado à garagem.");
    }

    public void listarVeiculos() {
        System.out.println("\n--- Veículos na Garagem ---");
        if (veiculos.isEmpty()) {
            System.out.println("A garagem está vazia.");
            return;
        }

        for (T veiculo : veiculos) {
            // Como usamos "T extends br.com.panassol.generics.modelos.Carro", o compilador SABE que os métodos
            // getModelo() e acelerar() existem, eliminando a necessidade de cast.
            System.out.println("- " + veiculo.getModelo());
            veiculo.acelerar();
        }
        System.out.println("---------------------------\n");
    }

    public T buscarPorIndice(int index) {
        if(index >= 0 && index < veiculos.size()) {
            return veiculos.get(index);
        }
        throw new IndexOutOfBoundsException("Índice de veículo inválido.");
    }
}
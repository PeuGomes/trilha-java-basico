package controller;

public class Navegador implements INavegador {
    @Override
    public void exibirPagina() {
        System.out.println("Navegador: exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Navegador: adicionando aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador: atualizando página");
    }
}
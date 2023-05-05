package view;

import controller.Navegador;
import controller.Player;
import controller.Telefone;
import model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone(
            new Telefone(),
            new Navegador(),
            new Player()
        );

        iphone.telefone().fazerLigacao();
        iphone.telefone().atenderChamada();
        iphone.telefone().iniciarCorreioVoz();

        iphone.navegador().exibirPagina();
        iphone.navegador().adicionarNovaAba();
        iphone.navegador().atualizarPagina();

        iphone.player().tocarMusica();
        iphone.player().pausarMusica();
        iphone.player().selecionarMusica();
    }
}
package model;
import controller.INavegador;
import controller.IPlayer;
import controller.ITelefone;

public class Iphone {
    private ITelefone telefone;
    private INavegador navegador;
    private IPlayer player;

    public Iphone(ITelefone telefone, INavegador navegador, IPlayer player) {
        this.telefone = telefone;
        this.navegador = navegador;
        this.player = player;
    }

    public ITelefone telefone() {
        return telefone;
    }

    public INavegador navegador() {
        return navegador;
    }

    public IPlayer player() {
        return player;
    }
}

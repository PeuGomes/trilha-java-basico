package controller;

public class Player implements IPlayer {
    @Override
    public void tocarMusica() {
        System.out.println("Player: tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Player: pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Player: selecionando música");
    }
}
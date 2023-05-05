package controller;

public class Telefone implements ITelefone {
    @Override
    public void fazerLigacao() {
        System.out.println("Telefone: fazendo ligação");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Telefone: atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Telefone: iniciando correio de voz");
    }
}

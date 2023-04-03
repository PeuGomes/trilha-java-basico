public class Cliente extends Conta {
    private String nome;
    public Cliente(int numero, int agencia, double saldo, String nome) {
		super(numero, agencia, saldo);
		this.nome = nome;
	}
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

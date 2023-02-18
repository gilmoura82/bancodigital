package Classes;

public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	private static int CLIENTE = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected int cliente;
	
	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = CLIENTE++;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;	
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int getCliente() {
		return cliente;
	}

	protected void imprimirDados() {
		System.out.println(String.format("Cliente: %d", this.cliente));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	
	
	

}

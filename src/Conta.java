public class Conta {
	private int numero;
	private String agencia;
	private String nomeCliente;
	private Double saldo;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Conta(int numeroConta, String nomeAgencia, String nomeCliente, double saldo) {
		this.numero = getNumero();
		this.agencia = getAgencia();
		this.nomeCliente = getNomeCliente();
		this.saldo = getSaldo();
	}

}

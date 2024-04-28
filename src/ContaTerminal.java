import java.util.Scanner;

public class ContaTerminal {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Solicita e armazena o número da conta
		System.out.print("Por favor, digite o número da agência: ");
		int numeroAgencia = scanner.nextInt();

		// Solicita e armazena o nome da agência
		System.out.print("Por favor, digite o nome da agência: ");
		String nomeAgencia = scanner.next();

		// Solicita e armazena o nome do cliente
		System.out.print("Por favor, digite o nome do cliente: ");
		scanner.nextLine();
		String nomeCliente = scanner.nextLine();

		// Solicita e armazena o saldo
		System.out.print("Por favor, digite o saldo: ");
		double saldo = scanner.nextDouble();

		// Cria a conta bancária com os dados coletados
		Conta conta = new Conta(numeroAgencia, nomeAgencia, nomeCliente, saldo);

		// Exibe a mensagem final com os dados da conta
		System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco!");
		System.out.println("Sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero()
				+ " e seu saldo é de R$ " + conta.getSaldo());
	}
}

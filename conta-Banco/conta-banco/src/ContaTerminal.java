import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário
        
        // Exibir mensagem para o usuário
        System.out.println("Bem-vindo! Por favor, insira os detalhes da sua conta:");

        // Solicitar informações da conta ao usuário
        System.out.print("Nome do titular da conta: ");
        String titularConta = scanner.nextLine();

        System.out.print("Saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        // Criar uma instância da classe Conta
        Conta conta = new Conta(titularConta, saldoInicial);

        // Exibir mensagem de conta criada
        System.out.println("Conta criada com sucesso para " + conta.getTitularConta() + " com saldo de R$" + conta.getSaldo());
    }
}

class Conta {
    private String titularConta;
    private double saldo;

    public Conta(String titularConta, double saldo) {
        this.titularConta = titularConta;
        this.saldo = saldo;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
public class Main {
    public static void main(String[] args) {
        ContaBancaria contaCorrente = new ContaCorrente(1000);
        ContaBancaria contaPoupanca = new ContaPoupanca(500);

        Banco banco = new Banco();

        contaCorrente.depositar(200);
        contaPoupanca.depositar(100);

        banco.realizarTransferencia(300, contaCorrente, contaPoupanca);

        System.out.println("Saldo Conta Corrente: " + ((ContaCorrente)contaCorrente).getSaldo());
        System.out.println("Saldo Conta Poupança: " + ((ContaPoupanca)contaPoupanca).getSaldo());
    }
}
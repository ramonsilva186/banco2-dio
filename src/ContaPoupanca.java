public class ContaPoupanca implements ContaBancaria {

    private double saldo;

    public ContaPoupanca(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depositado: " + valor);
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Sacado: " + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    @Override
    public void transferir(double valor, ContaBancaria contaDestino) {
        if (valor > 0 && saldo >= valor) {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferido: " + valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

public class ContaCorrente implements ContaBancaria {
    private double saldo;

        public ContaCorrente(double saldo) {
            this.saldo = saldo;
        }

        @Override
        public void depositar(double valor) {
            if (valor > 0){
                saldo += valor;
                System.out.println("Depositado: " + valor);
            }
        }

        @Override
        public void sacar(double valor) {
            if (valor > 0 && saldo >= valor){
                saldo -= valor;
                System.out.println("Sacado: " + valor);
            } else {
                System.out.println("Saldo insuficiente");
            }
        }

        @Override
        public void transferir(double valor, ContaBancaria contaDestino) {
            if (valor > 0 && saldo >= valor) {
                sacar(valor);
                contaDestino.depositar(valor);
                System.out.println("Transferido: " + valor);
            } else {
                System.out.println("Saldo insuficiente");
            }
        }

        public double getSaldo() {
            return saldo;
        }
}

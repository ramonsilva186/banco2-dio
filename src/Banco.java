public class Banco {

    public void realizarTransferencia(double valor, ContaBancaria contaOrigem, ContaBancaria contaDestino) {
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(valor, contaDestino);
        } else {
            System.out.println("Conta origem ou conta destino inválidas.");
        }
    }
}

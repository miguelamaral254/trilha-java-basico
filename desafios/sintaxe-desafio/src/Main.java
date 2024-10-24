import domain.entities.Conta;
import services.ContaService;

public class Main {
    public static void main(String[] args) {

        ContaService contaService = new ContaService();
        Conta conta = contaService.criarConta();
        conta.exibirMensagem();
        contaService.fecharScanner();
    }
}
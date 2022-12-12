
/*
 * Cada terminal contém um leitor de cartão magnético. 
 * Um terminal aceita dinheiro, que é convertido em créditos em um cartão. 
 * O dinheiro é aceito como números inteiros. Os créditos são concedidos em uma proporção de dois créditos a cada um dólar. 
 * Os jogadores usam um terminal para verificar os saldos de seus cartões. Inclua o número do cartão nessa impressão. Todos os créditos, ou apenas uma parte deles, podem ser transferidos entre cartões. 
 * Sempre imprima os saldos de um cartão quando seus créditos ou tíquetes forem acessados por meio de um terminal. Por último, os tíquetes podem ser trocados nos terminais por prêmios.
 *  Imprima uma mensagem de erro se o cartão não tiver tíquetes suficientes ou o terminal estiver sem um tipo específico de prêmio. Imprima quando um prêmio for concedido e o número restante desse prêmio aparecer no terminal.  
 * Um terminal oferece três categorias de prêmios. 

 */
public class terminal {
    private premio PremioPelucia;
    private premio PremioJogoTabuleiro;
    private premio PremioCamisa;

    public void carregarDinheiro(int dinheiro, cartao cartaoUsado) {
        cartaoUsado.setSaldoAtual(cartaoUsado.getSaldoAtual() + (dinheiro * 2));
    }

    public void verSaldo(cartao cartaoUsado) {
        System.out.println("Seu saldo de tickets é: " + cartaoUsado.getSaldoTickets());
        System.out.println("Seu saldo atual de créditos é de " + cartaoUsado.getSaldoTickets());
    }

    public void transferirSaldo(cartao cartao1, cartao cartao2, int transferencia){
        if(cartao1.getSaldoAtual() < transferencia){
            System.out.println("Quantidade de créditos indisponível.");
        }else{
            cartao1.setSaldoAtual(cartao1.getSaldoAtual()-transferencia);
            cartao2.setSaldoAtual(cartao2.getSaldoAtual()+transferencia);
            System.out.println("A transferência foi um sucesso.");
            System.out.println("Seu saldo após ter transferido é: " + cartao1.getSaldoAtual());
            System.out.println("Seu saldo após receber a transferência é de " + cartao2.getSaldoAtual());
        }
    }
    public void transferirSaldoTicket(cartao cartao1, cartao cartao2, int transferencia) {
        if (cartao1.getSaldoTickets() < transferencia) {
            System.out.println("Quantidade de créditos indisponível.");
        } else {
            cartao1.setSaldoAtual(cartao1.getSaldoTickets() - transferencia);
            cartao2.setSaldoAtual(cartao2.getSaldoTickets() + transferencia);
            System.out.println("A transferência foi um sucesso.");
            System.out.println("Seu saldo após ter transferido é: " + cartao1.getSaldoTickets());
            System.out.println("Seu saldo após receber a transferência é de " + cartao2.getSaldoTickets());
        }
    }

    public void resgatarPremio(cartao cartaoUsado, premio premioResgatado) {
        if (premioResgatado.getQuantidade() < 0 || cartaoUsado.getSaldoTickets() < premioResgatado.getPrecoTickets()) {
            System.out.println("Não é possível realizar o resgate do prêmio");
        } else {
            cartaoUsado.setSaldoTickets(cartaoUsado.getSaldoTickets() - premioResgatado.getPrecoTickets());
            System.out.println("O resgate foi um sucesso.");
            System.out.println("Seu novo saldo de tickets é de: " + cartaoUsado.getSaldoTickets());
        }
    }

    public terminal() {
        this.PremioCamisa = new premio();
        this.PremioJogoTabuleiro = new premio();
        this.PremioPelucia = new premio();

        PremioCamisa.setNome("Camisas");
        PremioCamisa.setPrecoTickets(50);
        PremioCamisa.setQuantidade(20);

        PremioJogoTabuleiro.setNome("Jogo");
        PremioJogoTabuleiro.setPrecoTickets(150);
        PremioJogoTabuleiro.setQuantidade(20);

        PremioPelucia.setNome("Pelucia");
        PremioPelucia.setPrecoTickets(350);
        PremioPelucia.setQuantidade(20);
    }

    public premio getPremioCamisa() {
        return PremioCamisa;
    }

    public premio getPremioJogoTabuleiro() {
        return PremioJogoTabuleiro;
    }

    public premio getPremioPelucia() {
        return PremioPelucia;
    }
}

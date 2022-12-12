/* Instancie dois cartões e quaisquer outros objetos que sejam necessários para testar seu programa. 
        Carregue os créditos em cada cartão.
        Jogue um grupo de jogos usando dois cartões.
        Transfira o saldo de créditos e tíquetes do Cartão 1 para o 2.
        Solicite prêmios usando o Cartão 2.
        Tente jogar um jogo e solicitar um prêmio usando o Cartão 1.
        Execute quaisquer outras ações que sejam necessárias para testar seu programa.
*/

public class test {
    public static void main(String[] args) {
        cartao CartaoDaVinci = new cartao();
        cartao CartaoVanGogh = new cartao();    

        CartaoDaVinci.setIdExclusivo("d4-v1nc1");
        CartaoVanGogh.setIdExclusivo("v4n-g0gh");
        CartaoDaVinci.setSaldoTickets(10000);
        CartaoVanGogh.setSaldoTickets(20000);

        //Carregar créditos
        terminal TerminalCentral = new terminal();
        TerminalCentral.carregarDinheiro(10000, CartaoDaVinci);
        TerminalCentral.carregarDinheiro(20000, CartaoVanGogh);

        //Jogar jogos
        jogo JogoDosTiquetes = new jogo();
        JogoDosTiquetes.setCreditosParaJogar(40);
        JogoDosTiquetes.jogarComCartao(CartaoVanGogh);
        JogoDosTiquetes.jogarComCartao(CartaoDaVinci);

        //Transferir creditos
        TerminalCentral.transferirSaldo(CartaoDaVinci, CartaoVanGogh, 30);
        TerminalCentral.transferirSaldoTicket(CartaoDaVinci, CartaoVanGogh, 10);


        //Solicitar premio
        TerminalCentral.resgatarPremio(CartaoVanGogh, TerminalCentral.getPremioPelucia());
        
        //Jogar e Solicitar premio
        JogoDosTiquetes.jogarComCartao(CartaoDaVinci);
        TerminalCentral.resgatarPremio(CartaoDaVinci, TerminalCentral.getPremioJogoTabuleiro());
    }
}

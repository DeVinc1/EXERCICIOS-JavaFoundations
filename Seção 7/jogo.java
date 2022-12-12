/* Os jogos precisam de um número específico de créditos para poderem ser jogados. 
    Cada jogo está equipado com um leitor de cartão magnético e um monitor de LCD. 
    Quando o cartão é passado na máquina, isso reduz o saldo de créditos, mas dá um número aleatório e não negativo de tíquetes. 
    Imprima o número do cartão e o número de tíquetes ganhos, junto com o novo total. Imprima uma mensagem se um cartão tiver créditos insuficientes para jogar um jogo. 
 */

public class jogo {
    private int creditosParaJogar;


    public void jogarComCartao(cartao cartaoUsado){
        if(cartaoUsado.getSaldoAtual() < creditosParaJogar){
            System.out.println("Você não tem créditos suficientes para jogar.");
        }
        else{
        int ticketsGanhos = (int) Math.ceil(Math.random() * 100);
        cartaoUsado.setSaldoAtual(cartaoUsado.getSaldoAtual() - creditosParaJogar);

        System.out.println("Cartão " + cartaoUsado.getIdExclusivo() + ",");
        System.out.println("Você ganhou " + ticketsGanhos);
        System.out.println("Você gastou " + creditosParaJogar);

        cartaoUsado.setSaldoTickets(cartaoUsado.getSaldoTickets() + ticketsGanhos);
        }
    }

    public void setCreditosParaJogar(int creditosParaJogar) {
        this.creditosParaJogar = creditosParaJogar;
    }
    
}

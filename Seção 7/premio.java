/* Cada categoria de prêmio tem um nome, um número de tíquetes obrigatórios para ganhar esse prêmio e uma contagem de quantos itens dessa categoria permanecem em um terminal. */

public class premio {
    private String nome;
    private int precoTickets;
    private int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrecoTickets(int precoTickets) {
        this.precoTickets = precoTickets;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public int getPrecoTickets() {
        return precoTickets;
    }
    public int getQuantidade() {
        return quantidade;
    }
}

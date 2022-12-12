/* Os cartões armazenam informações sobre o saldo atual do cartão de crédito, o saldo de tíquetes e o número do cartão. Nenhum desses saldos pode ser negativo. 
    Os cartões individuais não conseguem fazer cálculos, nem somas simples, nem perceber que os saldos estão ficando negativos. 
    Cada cartão é criado com um número de identificação inteiro exclusivo
*/
public class cartao {
    private double saldoAtual;
    private int saldoTickets;
    private String idExclusivo;

    public double getSaldoAtual() {
        return saldoAtual;
    }
    public int getSaldoTickets() {
        return saldoTickets;
    }
    public String getIdExclusivo() {
        return idExclusivo;
    }
    public void setSaldoAtual(double saldoAtual) {
        if(saldoAtual < 0){
            System.out.println("Valor incorreto");
        }
        this.saldoAtual = saldoAtual;
    }
    public void setSaldoTickets(int saldoTickets) {
        if(saldoTickets < 0){
            System.out.println("Valor incorreto");
        }
        this.saldoTickets = saldoTickets;
    }
    public void setIdExclusivo(String idExclusivo) {
        this.idExclusivo = idExclusivo;
    }
}

/**
 * Classe Atendente: Especialização de Pessoa.
 * Lida com operações de caixa e recebimentos.
 */
public non-sealed class Atendente extends Pessoa {
    // Atributo para controlar o montante financeiro no caixa
    double valorEmCaixa;

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setSenha(String senha) {
        super.setSenha(senha);
    }

    @Override
    public void realizarlogin() {
        super.realizarlogin();
    }

    @Override
    public void realizarlogff() {
        super.realizarlogff();
    }

    // Registra a entrada de valor no caixa
    public void receberPagamento(){
        // Dica: Para somar, deveria ser: setValorEmCaixa(getValorEmCaixa() + 1);
        setValorEmCaixa(+1);
    }

    // Finaliza o expediente do caixa
    public void fecharCaixa(){
        System.out.println("Fechar caixa ...");
    }
}

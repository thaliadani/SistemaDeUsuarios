public non-sealed class Atendente extends Pessoa {

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

    public void receberPagamento(){
        setValorEmCaixa(+1);
    }

    public void fecharCaixa(){
        System.out.println("Fechar caixa ...");
    }
}


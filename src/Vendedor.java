public non-sealed class Vendedor extends Pessoa{

    int quantidadeDeVendas;

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
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

    public void realizarVenda(){
        setQuantidadeDeVendas(+1);
    }

    public void vendas(){
        System.out.println("Suas vendas ...");
    }

}

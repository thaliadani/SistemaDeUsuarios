/**
 * Classe Vendedor: Especialização de Pessoa.
 * Focada no controle de volume de vendas.
 */
public non-sealed class Vendedor extends Pessoa{
    // Atributo específico para contar o número de vendas realizadas
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

    // Incrementa o contador de vendas
    public void realizarVenda(){
        // Dica: Para somar, deveria ser: setQuantidadeDeVendas(getQuantidadeDeVendas() + 1);
        setQuantidadeDeVendas(+1);
    }

    public void vendas(){
        System.out.println("Suas vendas ...");
    }

}

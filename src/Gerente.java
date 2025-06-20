public non-sealed class Gerente extends Pessoa {

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
    public void setAdministrador(boolean administrador) {
        super.setAdministrador(administrador);
    }

    @Override
    public boolean isAdministrador() {
        return true;
    }

    @Override
    public void realizarlogin() {
        super.realizarlogin();
    }

    @Override
    public void realizarlogff() {
        super.realizarlogff();
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerando relatorio ...");
    }

    public void consultarVendas() {
        System.out.println("Consultar Vendas ...");
    }

}
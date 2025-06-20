public sealed class Pessoa permits Atendente, Gerente, Vendedor {
    String nome;
    String email;
    String senha;
    boolean administrador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public void realizarlogin(){
        System.out.println("Realizar login ...");
    }

    public void realizarlogff(){
        System.out.println("Realizar logoff ...");
    }
}

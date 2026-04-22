/**
 * Classe base que representa uma Pessoa no sistema.
 * Utiliza o modificador 'sealed' para restringir quais classes podem herdá-la.
 */
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

    // Método simulando a ação de login
    public void realizarlogin(){
        System.out.println("Realizar login ...");
    }

    // Método simulando a ação de logoff
    public void realizarlogff(){
        System.out.println("Realizar logoff ...");
    }
}

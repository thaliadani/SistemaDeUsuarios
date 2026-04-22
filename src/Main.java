/**
 * Classe principal para testar o funcionamento do sistema de usuários.
 */
public class Main {
    public static void main(String[] args) {
        // Instanciação dos diferentes tipos de funcionários
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Atendente atendente = new Atendente();

        // Configuração dos dados do Gerente
        gerente.setNome("Paulo");
        gerente.setEmail("paulo@gmail.com");
        gerente.setSenha("daw23QEQEQD");

        // Configuração dos dados do Vendedor
        vendedor.setNome("Ana");
        vendedor.setEmail("ana@gmail.com");
        vendedor.setSenha("dfwf2313");

        atendente.setNome("Carla");
        atendente.setEmail("carla@gmail.com");
        atendente.setSenha("1edf24r41");

        // Demonstração das ações do Gerente
        System.out.println("====================");
        System.out.println("Administrador: " + gerente.isAdministrador());
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Email: " + gerente.getEmail());
        System.out.println("Senha: " + gerente.getSenha());
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();

        // Demonstração das ações do Vendedor
        System.out.println("====================");
        System.out.println("Administrador: " + vendedor.isAdministrador());
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Email: " + vendedor.getEmail());
        System.out.println("Senha: " + vendedor.getSenha());
        vendedor.realizarVenda();
        System.out.println("Quantidade de vendas: " + vendedor.getQuantidadeDeVendas());
        vendedor.vendas();

        // Demonstração das ações do Atendente
        System.out.println("====================");
        System.out.println("Administrador: " + atendente.isAdministrador());
        System.out.println("Nome: " + atendente.getNome());
        System.out.println("Email: " + atendente.getEmail());
        System.out.println("Senha: " + atendente.getSenha());
        atendente.receberPagamento();
        System.out.println("Valor em caixa: "+ atendente.getValorEmCaixa());
        atendente.fecharCaixa();
    }
}
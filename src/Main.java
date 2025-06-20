public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Atendente atendente = new Atendente();

        gerente.setNome("Paulo");
        gerente.setEmail("paulo@gmail.com");
        gerente.setSenha("daw23QEQEQD");

        vendedor.setNome("Ana");
        vendedor.setEmail("ana@gmail.com");
        vendedor.setSenha("dfwf2313");

        atendente.setNome("Carla");
        atendente.setEmail("carla@gmail.com");
        atendente.setSenha("1edf24r41");

        System.out.println("====================");
        System.out.println("Administrador: " + gerente.isAdministrador());
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Email: " + gerente.getEmail());
        System.out.println("Senha: " + gerente.getSenha());
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();

        System.out.println("====================");
        System.out.println("Administrador: " + vendedor.isAdministrador());
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Email: " + vendedor.getEmail());
        System.out.println("Senha: " + vendedor.getSenha());
        vendedor.realizarVenda();
        System.out.println("Quantidade de vendas: " + vendedor.getQuantidadeDeVendas());
        vendedor.vendas();

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
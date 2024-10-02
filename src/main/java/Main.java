public class Main {
    public static void main(String[] args) {
        SIGFacade sig = new SIGFacade();

        // Testes Administrativos
        System.out.println("Testando Subsistema Administrativo:");
        sig.agendarReuniaoDiretoria("Dr. Silva", "10/10/2024");
        sig.realizarEntrevistaCandidato("Maria Oliveira");
        System.out.println();

        // Testes Financeiros
        System.out.println("Testando Subsistema Financeiro:");
        sig.exibirBalancoFinanceiro();
        sig.exibirFolhaDePagamento();
        System.out.println();

        // Testes Relacionados a Professores
        System.out.println("Testando Subsistema de Professores:");
        sig.alocarProfessorDisciplina("Matemática", "Prof. João");
        sig.exibirTempoDeCasaProfessor("Prof. João");
        System.out.println();

        // Testes Relacionados a Alunos
        System.out.println("Testando Subsistema de Alunos:");
        sig.exibirHistoricoAluno("Pedro Santos");
        sig.exibirRDMAluno("Pedro Santos");
        System.out.println();

        // Testes do Almoxarifado
        System.out.println("Testando Subsistema do Almoxarifado:");
        sig.verificarEstoqueItem("Projetor");
        sig.realizarPedidoCompraItem("Projetor", 5);
        System.out.println();

        // Testes de Infraestrutura
        System.out.println("Testando Subsistema de Infraestrutura:");
        sig.alocarSalaHorario("Sala 101", "08:00 - 10:00");
        sig.exibirAlocacaoSalas();
    }
}

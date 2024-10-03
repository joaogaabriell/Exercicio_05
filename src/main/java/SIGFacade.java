public class SIGFacade {
    private SubsysAdministrative administrative;
    private SubsysFinancial financial;
    private SubsysTeachers teachers;
    private SubsysStudents students;
    private SubsysWarehouse warehouse;
    private SubsysInfrastructure infrastructure;

    public SIGFacade() {
        administrative = new SubsysAdministrative();
        financial = new SubsysFinancial();
        teachers = new SubsysTeachers();
        students = new SubsysStudents();
        warehouse = new SubsysWarehouse();
        infrastructure = new SubsysInfrastructure();
    }

    // Métodos administrativos
    public boolean agendarReuniaoDiretoria(String diretor, String data) {
        boolean success = administrative.agendarReuniao(diretor, data);
        System.out.println("Agendando reunião com o diretor " + diretor + " na data " + data + ": " + (success ? "Sucesso" : "Falha"));
        return success;
    }

    public boolean realizarEntrevistaCandidato(String candidato) {
        boolean success = administrative.realizarEntrevista(candidato);
        System.out.println("Realizando entrevista com o candidato " + candidato + ": " + (success ? "Sucesso" : "Falha"));
        return success;
    }

    // Métodos financeiros
    public String exibirBalancoFinanceiro() {
        String balanco = financial.exibirBalanco();
        System.out.println("Balanço Financeiro: " + balanco);
        return balanco;
    }

    public String exibirFolhaDePagamento() {
        String folhaPagamento = financial.exibirFolhaPagamento();
        System.out.println("Folha de Pagamento: " + folhaPagamento);
        return folhaPagamento;
    }

    // Métodos relacionados a professores
    public boolean alocarProfessorDisciplina(String disciplina, String professor) {
        boolean success = teachers.alocarProfessor(disciplina, professor);
        System.out.println("Alocando professor " + professor + " à disciplina " + disciplina + ": " + (success ? "Sucesso" : "Falha"));
        return success;
    }

    public String exibirTempoDeCasaProfessor(String professor) {
        String tempoCasa = teachers.exibirTempoCasa(professor);
        System.out.println("Professor " + professor + " tem " + tempoCasa + " de casa.");
        return tempoCasa;
    }

    // Métodos relacionados a alunos
    public String exibirHistoricoAluno(String aluno) {
        String historico = students.exibirHistorico(aluno);
        System.out.println("Histórico do Aluno " + aluno + ": " + historico);
        return historico;
    }

    public String exibirRDMAluno(String aluno) {
        String rdm = students.exibirRDM(aluno);
        System.out.println("RDM do Aluno " + aluno + ": " + rdm);
        return rdm;
    }

    // Métodos do almoxarifado
    public int verificarEstoqueItem(String item) {
        int estoque = warehouse.verificarEstoque(item);
        System.out.println("Estoque de " + item + ": " + estoque + " unidades.");
        return estoque;
    }

    public boolean realizarPedidoCompraItem(String item, int quantidade) {
        boolean success = warehouse.realizarPedidoCompra(item, quantidade);
        System.out.println("Realizando pedido de compra de " + quantidade + " unidades de " + item + ": " + (success ? "Sucesso" : "Falha"));
        return success;
    }

    // Métodos de infraestrutura
    public boolean alocarSalaHorario(String sala, String horario) {
        boolean success = infrastructure.alocarSala(sala, horario);
        System.out.println("Alocando sala " + sala + " para o horário " + horario + ": " + (success ? "Sucesso" : "Falha"));
        return success;
    }

    public String exibirAlocacaoSalas() {
        String alocacaoSalas = infrastructure.exibirAlocacaoSalas();
        System.out.println("Alocação de Salas: " + alocacaoSalas);
        return alocacaoSalas;
    }
}

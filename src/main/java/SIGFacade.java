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
    public void agendarReuniaoDiretoria(String diretor, String data) {
        System.out.println("Agendando reunião com o diretor " + diretor + " na data " + data + ".");
        administrative.agendarReuniao(diretor, data);
    }

    public void realizarEntrevistaCandidato(String candidato) {
        System.out.println("Realizando entrevista com o candidato " + candidato + ".");
        administrative.realizarEntrevista(candidato);
    }

    // Métodos financeiros
    public void exibirBalancoFinanceiro() {
        String balanco = financial.exibirBalanco();
        System.out.println("Balanço Financeiro: " + balanco);
    }

    public void exibirFolhaDePagamento() {
        String folhaPagamento = financial.exibirFolhaPagamento();
        System.out.println("Folha de Pagamento: " + folhaPagamento);
    }

    // Métodos relacionados a professores
    public void alocarProfessorDisciplina(String disciplina, String professor) {
        System.out.println("Alocando professor " + professor + " à disciplina " + disciplina + ".");
        teachers.alocarProfessor(disciplina, professor);
    }

    public void exibirTempoDeCasaProfessor(String professor) {
        String tempoCasa = teachers.exibirTempoCasa(professor);
        System.out.println("Professor " + professor + " tem " + tempoCasa + " de casa.");
    }

    // Métodos relacionados a alunos
    public void exibirHistoricoAluno(String aluno) {
        String historico = students.exibirHistorico(aluno);
        System.out.println("Histórico do Aluno " + aluno + ": " + historico);
    }

    public void exibirRDMAluno(String aluno) {
        String rdm = students.exibirRDM(aluno);
        System.out.println("RDM do Aluno " + aluno + ": " + rdm);
    }

    // Métodos do almoxarifado
    public void verificarEstoqueItem(String item) {
        int estoque = warehouse.verificarEstoque(item);
        System.out.println("Estoque de " + item + ": " + estoque + " unidades.");
    }

    public void realizarPedidoCompraItem(String item, int quantidade) {
        System.out.println("Realizando pedido de compra de " + quantidade + " unidades de " + item + ".");
        warehouse.realizarPedidoCompra(item, quantidade);
    }

    // Métodos de infraestrutura
    public void alocarSalaHorario(String sala, String horario) {
        System.out.println("Alocando sala " + sala + " para o horário " + horario + ".");
        infrastructure.alocarSala(sala, horario);
    }

    public void exibirAlocacaoSalas() {
        String alocacaoSalas = infrastructure.exibirAlocacaoSalas();
        System.out.println("Alocação de Salas: " + alocacaoSalas);
    }
}

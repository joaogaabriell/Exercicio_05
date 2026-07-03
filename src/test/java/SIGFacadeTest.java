import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SIGFacadeTest {

    private SIGFacade sig;

    @BeforeEach
    void setUp() {
        sig = new SIGFacade();
    }

    @Test
    void testAgendarReuniaoDiretoria() {
        boolean result = sig.agendarReuniaoDiretoria("Dr. Silva", "10/10/2024");
        assertTrue(result, "Agendamento da reunião deveria ser bem-sucedido.");
    }

    @Test
    void testRealizarEntrevistaCandidato() {
        boolean result = sig.realizarEntrevistaCandidato("Maria Oliveira");
        assertTrue(result, "Entrevista com o candidato deveria ser bem-sucedida.");
    }

    @Test
    void testExibirBalancoFinanceiro() {
        String balanco = sig.exibirBalancoFinanceiro();
        assertNotNull(balanco, "O balanço financeiro não deve ser nulo.");
    }

    @Test
    void testExibirFolhaDePagamento() {
        String folhaPagamento = sig.exibirFolhaDePagamento();
        assertNotNull(folhaPagamento, "A folha de pagamento não deve ser nula.");
    }

    @Test
    void testAlocarProfessorDisciplina() {
        boolean result = sig.alocarProfessorDisciplina("Matemática", "Prof. João");
        assertTrue(result, "Alocação de professor na disciplina deveria ser bem-sucedida.");
    }

    @Test
    void testExibirTempoDeCasaProfessor() {
        String tempoCasa = sig.exibirTempoDeCasaProfessor("Prof. João");
        assertNotNull(tempoCasa, "O tempo de casa do professor não deve ser nulo.");
    }

    @Test
    void testExibirHistoricoAluno() {
        String historico = sig.exibirHistoricoAluno("Pedro Santos");
        assertNotNull(historico, "O histórico do aluno não deve ser nulo.");
    }

    @Test
    void testExibirRDMAluno() {
        String rdm = sig.exibirRDMAluno("Pedro Santos");
        assertNotNull(rdm, "O RDM do aluno não deve ser nulo.");
    }

    @Test
    void testVerificarEstoqueItem() {
        int estoque = sig.verificarEstoqueItem("Projetor");
        assertTrue(estoque >= 0, "O estoque do item deve ser um valor não negativo.");
    }

    @Test
    void testRealizarPedidoCompraItem() {
        boolean result = sig.realizarPedidoCompraItem("Projetor", 5);
        assertTrue(result, "O pedido de compra deveria ser bem-sucedido.");
    }

    @Test
    void testAlocarSalaHorario() {
        boolean result = sig.alocarSalaHorario("Sala 101", "08:00 - 10:00");
        assertTrue(result, "A alocação da sala deveria ser bem-sucedida.");
    }

    @Test
    void testExibirAlocacaoSalas() {
        String alocacaoSalas = sig.exibirAlocacaoSalas();
        assertNotNull(alocacaoSalas, "A alocação de salas não deve ser nula.");
    }
}

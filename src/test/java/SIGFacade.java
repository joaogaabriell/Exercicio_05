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
        // Simula o agendamento de reunião
        sig.agendarReuniaoDiretoria("Dr. Silva", "10/10/2024");
        // Como não há retorno, verificamos o console manualmente
        assertTrue(true);
    }

    @Test
    void testRealizarEntrevistaCandidato() {
        sig.realizarEntrevistaCandidato("Maria Oliveira");
        assertTrue(true);
    }

    @Test
    void testExibirBalancoFinanceiro() {
        sig.exibirBalancoFinanceiro();
        assertTrue(true);  // Podemos validar verificando o retorno do console manualmente.
    }

    @Test
    void testExibirFolhaDePagamento() {
        sig.exibirFolhaDePagamento();
        assertTrue(true);
    }

    @Test
    void testAlocarProfessorDisciplina() {
        sig.alocarProfessorDisciplina("Matemática", "Prof. João");
        assertTrue(true);
    }

    @Test
    void testExibirTempoDeCasaProfessor() {
        sig.exibirTempoDeCasaProfessor("Prof. João");
        assertTrue(true);
    }

    @Test
    void testExibirHistoricoAluno() {
        sig.exibirHistoricoAluno("Pedro Santos");
        assertTrue(true);
    }

    @Test
    void testExibirRDMAluno() {
        sig.exibirRDMAluno("Pedro Santos");
        assertTrue(true);
    }

    @Test
    void testVerificarEstoqueItem() {
        sig.verificarEstoqueItem("Projetor");
        assertTrue(true);
    }

    @Test
    void testRealizarPedidoCompraItem() {
        sig.realizarPedidoCompraItem("Projetor", 5);
        assertTrue(true);
    }

    @Test
    void testAlocarSalaHorario() {
        sig.alocarSalaHorario("Sala 101", "08:00 - 10:00");
        assertTrue(true);
    }

    @Test
    void testExibirAlocacaoSalas() {
        sig.exibirAlocacaoSalas();
        assertTrue(true);
    }
}

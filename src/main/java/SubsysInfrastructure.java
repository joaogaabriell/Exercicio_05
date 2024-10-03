public class SubsysInfrastructure {

    public boolean alocarSala(String sala, String horario) {
        // Lógica de alocação de sala
        System.out.println("Sala " + sala + " alocada para o horário " + horario);
        return true; // Sucesso na alocação
    }

    public String exibirAlocacaoSalas() {
        // Lógica para exibir a alocação de salas
        return "Sala 101: 08:00 - 10:00, Sala 202: 10:00 - 12:00"; // Exemplo
    }
}

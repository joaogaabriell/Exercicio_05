public class SubsysInfrastructure {
    public void alocarSala(String sala, String horario) {
        System.out.println("Sala " + sala + " alocada para o horário " + horario + ".");
    }

    public String exibirAlocacaoSalas() {

        return "Sala 101: 08:00 - 10:00, Sala 102: 10:00 - 12:00";
    }
}

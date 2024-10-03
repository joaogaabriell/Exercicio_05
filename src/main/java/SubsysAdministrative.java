public class SubsysAdministrative {

    public boolean agendarReuniao(String diretor, String data) {

        System.out.println("Reunião agendada com " + diretor + " na data " + data);
        return true;
    }

    public boolean realizarEntrevista(String candidato) {

        System.out.println("Entrevista realizada com " + candidato);
        return true;
    }
}

package Ditta;

public class Main {
    public static void main(String[] args) {

        DittaRiparazioni dittaRiparazioni = new DittaRiparazioni("Givul_Riparazioni");
        Tecnico tecnico = new Tecnico("Gabriel");
        dittaRiparazioni.addTecnico(tecnico);
        Tecnico tecnico1 = new Tecnico("Franco");
        dittaRiparazioni.addTecnico(tecnico1);
        dittaRiparazioni.addRiparazione(new Riparazione(Priority.BASSA,"Via Fasulla", tecnico));
        Riparazione r1 = new Riparazione("Via ok", Priority.URGENTE);
        dittaRiparazioni.addRiparazione(r1);

    }
}

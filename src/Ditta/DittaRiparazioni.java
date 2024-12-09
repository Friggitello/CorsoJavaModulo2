package Ditta;

import utils.ArrayUtils;

public class DittaRiparazioni {

    private String nome;
    private Tecnico[] tecnici;
    private Riparazione[] riparazioni;

    public DittaRiparazioni(String nome){
        this.nome = nome;
        this.tecnici = new Tecnico[1];
        this.riparazioni = new Riparazione[1];
    }

    public DittaRiparazioni(String nome, Tecnico[] tecnici, Riparazione[] riparazioni) {
        this.nome = nome;
        this.tecnici = tecnici;
        this.riparazioni = riparazioni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tecnico[] getTecnici() {
        return tecnici;
    }

    public void setTecnici(Tecnico[] tecnici) {
        this.tecnici = tecnici;
    }

    public Riparazione[] getRiparazioni() {
        return riparazioni;
    }

    public void setRiparazioni(Riparazione[] riparazioni) {
        this.riparazioni = riparazioni;
    }

    public void addTecnico(Tecnico tecnico){
        if (tecnici.length != 0){
            for (Tecnico t : tecnici){
                if (t.getNome().equals(tecnico.getNome())){
                    System.out.println("Esiste gia un " + t.getNome());
                    return;
                }
            }
        }
        this.tecnici = ArrayUtils.addTecnico(this.tecnici, tecnico);
    }

    public void addRiparazione(Riparazione riparazione){
        this.riparazioni = ArrayUtils.addRiparazione(this.riparazioni, riparazione);
    }

    public Riparazione[] riparazioniInAttesa(){
        Riparazione[] inAttesa = new Riparazione[0];
        for (Riparazione riparazione : this.riparazioni){
            if (riparazione.getTecnico()== null){
                inAttesa = ArrayUtils.addRiparazione(inAttesa, riparazione);
            }
        }
        return inAttesa;
    }

    public Riparazione riparazioneMaxPriority(){
        Riparazione[] riparazioni = riparazioniInAttesa();
        int maxPriority = 0;
        Riparazione maxRiparazione = null;
        for (Riparazione riparazione : riparazioni){
            int myPriority = riparazione.getPriority().getValue();
            if (myPriority > maxPriority){
                maxPriority = myPriority;
                maxRiparazione = riparazione;
            }
        }
        return maxRiparazione;
    }

    public void completaRiparazione (Riparazione riparazione){
        if (riparazione.getTecnico() == null) {
            System.out.println("Non puoi marcare come completata una riparazione non assegnata");
            return;
        }
        riparazione.setCompletata(true);
    }

    public void addRiparazioneToTecnico(Riparazione riparazione, Tecnico tecnico){
        if (tecnico.isInFerie()){
            System.out.println("Il tecnico è in ferie");
            return;
        }

        riparazione.setTecnico(tecnico);
    }

    public void ferieTecnici(Tecnico[] tecnici){
        for (Tecnico tecnico : tecnici){
            tecnico.setInFerie(true);
        }
    }

}

package Ditta;

public class Riparazione {

    private Integer id;
    private static Integer idCounter;
    private String indirizzo;
    private Priority priority;
    private Tecnico tecnico;
    private boolean completata;

    public Riparazione(Priority priority, String indirizzo, Tecnico tecnico) {
        this.priority = priority;
        this.indirizzo = indirizzo;
        this.id = ++idCounter;
        if (!tecnico.isInFerie()) {
            this.tecnico = tecnico;
        }
        this.completata = false;
    }

    public Riparazione(String indirizzo, Priority priority) {
        this.id = ++idCounter;
        this.indirizzo = indirizzo;
        this.priority = priority;
        this.completata = false;
    }

    public boolean isCompletata() {
        return completata;
    }

    public void setCompletata(boolean completata) {
        this.completata = completata;
    }

    public Integer getId() {
        return id;
    }

    public static Integer getIdCounter() {
        return idCounter;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setPriorityByValue(int value){
        this.priority = Priority.fromValue(value);
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        if (!tecnico.isInFerie()) {
            this.tecnico = tecnico;
        }
    }
}

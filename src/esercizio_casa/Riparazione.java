package esercizio_casa;

public class Riparazione {

    public Integer id;
    public static Integer idCounter = 0;
    public String indirizzo;
    public Integer priorita;
    public String concluso;

    public Riparazione(String indirizzo, Integer priorita){
        this.id = idCounter++;
        this.indirizzo = indirizzo;
        this.priorita = priorita;
    }

    public Integer getId() {
        return id;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public Integer getPriorita() {
        return priorita;
    }

    public String getConcluso() {
        return concluso;
    }

    @Override
    public String toString() {
        return "Riparazione{" +
                "id=" + id +
                ", indirizzo='" + indirizzo + '\'' +
                ", priorita=" + priorita +
                ", concluso='" + concluso + '\'' +
                '}';
    }
}

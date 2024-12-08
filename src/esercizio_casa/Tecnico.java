package esercizio_casa;

public class Tecnico {

    public Integer id;
    public static Integer idCounter = 0;
    public String nome;

    public Tecnico(String nome){
        this.nome = nome;
        this.id = idCounter++;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        // la prima cosa da verificare se obj è una Persona
        if (obj.getClass() != this.getClass()){
            return false;
        }
        Tecnico tecnico = (Tecnico) obj;
        return tecnico.nome.equals(this.nome);
        //In questo caso ho definito che sono uguali solo se hanno nome e cognome uguali
        //e non si basa sugli altri attributi dell'oggetto
    }
}

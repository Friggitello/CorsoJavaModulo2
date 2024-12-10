package Ereditarieta;

public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Gabriel", "David", 722078);
        Studente studente2 = new Studente("Franco", "Bollo", 151233);
        Professore professore1 = new Professore("Giancarlo","Zuzzu","Analisi",5);
        Professore professore2 = new Professore("Fabio", "Junior");
        System.out.println(studente2.hashCode());
        System.out.println(studente1.hashCode());
        System.out.println(professore2.hashCode());
        System.out.println(professore1.hashCode());
        Persona[] persone = {studente1, studente2, professore1, professore2};
        for (Persona p : persone){
            if (p.getClass().equals(Studente.class)){
                Studente studente = (Studente) p;
                System.out.println("La matricola dello studente " + studente.getNome() + " è " + studente.getMatricola());
            } else if (p instanceof Professore) {
                Professore professore = (Professore) p;
                System.out.println("Gli anni di servizio del prof " + professore.getNome() + " sono " + professore.getAnniServizio());
            }else System.out.println("Tipo non riconosciuto.");
        }
    }
}

package esempio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Gabriel", "David");
        p2.dataNascita = LocalDate.of(1999,11,15);
        p1.nome = "Gabriel";
        p1.cognome = "David";
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2 == p1);
        System.out.println(p1.equals(p2));
    }
}

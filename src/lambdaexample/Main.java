package lambdaexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Impiegato impiegato1 = new Impiegato("Gabriel","David","Maschile",1000);
        Impiegato impiegato2 = new Impiegato("Ciccio","Panza","Maschile",1500);
        Impiegato impiegato3 = new Impiegato("Franco","Bollo","Maschile",1200);
        Impiegato impiegato4 = new Impiegato("Cinzia","Costumi","Femminile",4321);
        Impiegato impiegato5 = new Impiegato("Francesca","Totti","Femminile",512312);
        List<Impiegato> lista= new ArrayList<>();
        lista.add(impiegato1);
        lista.add(impiegato2);
        lista.add(impiegato3);
        lista.add(impiegato4);
        lista.add(impiegato5);

        System.out.println("Impiegati maschili");
        lista.stream().filter(impiegato -> impiegato.getGenere().equals("Maschile")).forEach(System.out::println);
        System.out.println("Impiegati femminili");
        lista.stream().filter(impiegato -> impiegato.getGenere().equals("Femminile")).forEach(System.out::println);
        System.out.println("Mappatura");
        System.out.println(lista.stream().map(Impiegato::toString).collect(Collectors.joining(", ")));
    }
}

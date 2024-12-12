package Ffilm;
import utils.ArrayUtils;

import java.sql.Array;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Main {

    public static String infoPerGenere(Film[] array, Generi genere){
        Film[] risultato = new Film[0];
        for (Film film : array){
            if (film.getGenere().equals(genere)){
                risultato = ArrayUtils.addFilm(risultato, film);
            }
        }
        return Arrays.toString(risultato);
    }

    public static String infoPerRegista(Film[] array, String registaRichiesto){
        Film[] risultato = new Film[0];
        for (Film film : array){
            String regista = film.getRegista();
            if (film.getRegista().equalsIgnoreCase(registaRichiesto)){
                risultato = ArrayUtils.addFilm(risultato, film);
            }
        }
        return Arrays.toString(risultato);
    }

    public static String palinsesto(Film[] array){
        Film[] risultato = new Film[0];
        for (Film film : array){
            if (film.isDisponibile()){
                risultato = ArrayUtils.addFilm(risultato, film);
            }
        }
        return Arrays.toString(risultato);
    }

    public static void main(String[] args) {
        Film[] arrayFilm = new Film[8];
        arrayFilm[0] = new Film("Pinocchio",1940,Generi.ANIMAZIONE,"Hamilton Luske");
        arrayFilm[1] = new Film("Bambi",1942,Generi.ANIMAZIONE,"David Hand");
        arrayFilm[2] = new Film("Vacanze Romane",1953,Generi.COMMEDIA,"Roman Holiday");
        arrayFilm[3] = new Film("Rocky",1976,Generi.SPORT,"John Avildsen");
        arrayFilm[4] = new Film("Chinatown",1974,Generi.MYSTERY,"Roman Polanski");
        arrayFilm[5] = new Film("La Compagnia dell'Anello",2001,Generi.FANTASY,"Peter Jackson");
        arrayFilm[6] = new Film("Guerre Stellari",1977,Generi.FANTASCIENZA,"George Lucas");
        arrayFilm[7] = new Film("Titanic",1997,Generi.EPICO,"James Cameron");
        System.out.println(arrayFilm[3].infoFilm());
        arrayFilm[3].visionaFilm();
        System.out.println(arrayFilm[3].infoFilm());
        arrayFilm[3].visionaFilm();
        arrayFilm[3].terminaVisione();
        System.out.println(arrayFilm[3].infoFilm());
        System.out.println(infoPerGenere(arrayFilm,Generi.ANIMAZIONE));
        System.out.println(infoPerRegista(arrayFilm,"Peter Jackson"));
        arrayFilm[5].visionaFilm();
        arrayFilm[6].visionaFilm();
        arrayFilm[1].visionaFilm();
        System.out.println(palinsesto(arrayFilm));
    }


}

package utils;

import Ditta.Riparazione;
import Ditta.Tecnico;
import Ffilm.Film;

public class ArrayUtils {

    public static Film[] addFilm(Film[] arrayFilm, Film film){
        Film[] newArrayFilm = new Film[arrayFilm.length+1];
        for (int i= 0; i < arrayFilm.length; i++){
            newArrayFilm[i] = arrayFilm[i];
        }
        newArrayFilm[newArrayFilm.length-1] = film;
        return newArrayFilm;
    }

    public static Tecnico[] addTecnico(Tecnico[] arrayTecnici, Tecnico tecnico){
        Tecnico[] newArrayTecnici = new Tecnico[arrayTecnici.length+1];
        for (int i= 0; i < arrayTecnici.length; i++){
            newArrayTecnici[i] = arrayTecnici[i];
        }
        newArrayTecnici[newArrayTecnici.length-1] = tecnico;
        return newArrayTecnici;
    }

    public static Riparazione[] addRiparazione(Riparazione[] arrayRiparazioni, Riparazione riparazione){
        Riparazione[] newArrayRiparazioni = new Riparazione[arrayRiparazioni.length+1];
        for (int i= 0; i < arrayRiparazioni.length; i++){
            newArrayRiparazioni[i] = arrayRiparazioni[i];
        }
        newArrayRiparazioni[newArrayRiparazioni.length-1] = riparazione;
        return newArrayRiparazioni;
    }



}

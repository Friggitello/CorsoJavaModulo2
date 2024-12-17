package Compagnia_Shared_Mobilty.mappers;

import Compagnia_Shared_Mobilty.dto.UtenteRegisterRequest;
import Compagnia_Shared_Mobilty.entities.utente.Utente;

public class UtenteMapper {

    public static Utente toEntity(UtenteRegisterRequest request){
        Utente utente = new Utente();
        utente.setNome(request.nome());
        utente.setCognome(request.cognome());
        utente.setDataNascita(request.dataNascita());
        utente.setCodiceFiscale(request.codiceFiscale());
        return utente;
    }

}

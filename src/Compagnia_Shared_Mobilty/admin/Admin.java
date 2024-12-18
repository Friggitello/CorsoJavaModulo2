package Compagnia_Shared_Mobilty.admin;

import Compagnia_Shared_Mobilty.database.Database;
import Compagnia_Shared_Mobilty.dto.UtenteRegisterRequest;
import Compagnia_Shared_Mobilty.entities.noleggio.Noleggio;
import Compagnia_Shared_Mobilty.entities.utente.Utente;
import Compagnia_Shared_Mobilty.entities.veicolo.Veicolo;
import Compagnia_Shared_Mobilty.mappers.UtenteMapper;

public class Admin {

    public static Utente register(UtenteRegisterRequest request){
        Utente utente = UtenteMapper.toEntity(request);
        Database.addUtente(utente);
        return utente;
    }

    public static Veicolo insertVeicolo(Veicolo veicolo){
        Database.addVeicolo(veicolo);
        return veicolo;
    }

    public static Veicolo getVeicoloById(Integer id){
        return Database.getVeicoloById(id);
    }

    public static Noleggio insertNoleggio(Noleggio noleggio){
        Database.addNoleggio(noleggio);
        return noleggio;
    }

}

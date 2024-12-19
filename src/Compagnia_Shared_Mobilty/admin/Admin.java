package Compagnia_Shared_Mobilty.admin;

import Compagnia_Shared_Mobilty.database.Database;
import Compagnia_Shared_Mobilty.dto.UtenteRegisterRequest;
import Compagnia_Shared_Mobilty.entities.noleggio.Noleggio;
import Compagnia_Shared_Mobilty.entities.utente.Utente;
import Compagnia_Shared_Mobilty.entities.veicolo.Veicolo;
import Compagnia_Shared_Mobilty.mappers.UtenteMapper;

import java.util.List;

public class Admin {

    private static Admin instance;

    private Admin() { }

    public static Admin getInstance() {
        if (instance != null) return instance;
        else {
            instance = new Admin();
            return instance;
        }
    }

    public static Utente register(UtenteRegisterRequest request){
        Utente utente = UtenteMapper.toEntity(request);
        Database.addUtente(utente);
        return utente;
    }

    public static List<Utente> getAllUtenti(){
        return Database.getAllUtenti();
    }

    public static Veicolo insertVeicolo(Veicolo veicolo){
        Database.addVeicolo(veicolo);
        return veicolo;
    }

    public static Veicolo getVeicoloById(Integer id){
        return Database.getVeicoloById(id);
    }

    public static void insertNoleggio(Noleggio noleggio){
        Database.addNoleggio(noleggio);
    }

    public static List<Noleggio> getNoleggiById(Integer id_veicolo)   {
        return Database.getNoleggiByVeicoloId(id_veicolo);
    }

    public static List<Veicolo> getAllVeicoli(){
        return Database.getAllVeicoli();
    }
}

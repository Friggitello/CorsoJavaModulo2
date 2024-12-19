package Compagnia_Shared_Mobilty.main;

import Compagnia_Shared_Mobilty.admin.Admin;
import Compagnia_Shared_Mobilty.dto.UtenteRegisterRequest;
import Compagnia_Shared_Mobilty.entities.noleggio.Noleggio;
import Compagnia_Shared_Mobilty.entities.utente.TipoPatente;
import Compagnia_Shared_Mobilty.entities.utente.Utente;
import Compagnia_Shared_Mobilty.entities.veicolo.Auto;
import Compagnia_Shared_Mobilty.exceptions.VeicoloNotAvailableException;
import Compagnia_Shared_Mobilty.exceptions.VeicoloNotFoundException;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws VeicoloNotFoundException, VeicoloNotAvailableException, InterruptedException {
        Utente utente = Admin.register(new UtenteRegisterRequest(
                "Gabriel",
                "David",
                LocalDate.of(1999,11,15),
                "DVDNRG99S15Z129K"
        ));
        Auto auto = (Auto) Admin.insertVeicolo(new Auto(
                3.0,
                TipoPatente.TIPO_B,
                "AB123CD"
        ));
        System.out.println(Admin.getAllVeicoli());
        System.out.println(Admin.getAllUtenti());
        Noleggio noleggio = utente.attivaNoleggio(auto.getId());
        Thread.sleep(10*60*1000);
        Double prezzo = utente.terminaNoleggio(noleggio);
        System.out.println(prezzo);
    }
}

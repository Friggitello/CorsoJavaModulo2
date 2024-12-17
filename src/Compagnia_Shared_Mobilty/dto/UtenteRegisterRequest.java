package Compagnia_Shared_Mobilty.dto;

import java.time.LocalDate;

public record UtenteRegisterRequest(
        String nome,
        String cognome,
        LocalDate dataNascita,
        String codiceFiscale
) {
}

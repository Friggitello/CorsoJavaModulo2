package Compagnia_Shared_Mobilty.exceptions;
//estendendo Exception questo class diventa essa una exception
public class VeicoloNotFoundException extends Exception{

    public VeicoloNotFoundException(String message) {
        super(message);
    }
}

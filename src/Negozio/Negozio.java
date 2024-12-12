package Negozio;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Negozio {
    private String nome;
    private static List<Prodotto> prodotti = new ArrayList<>();;

    public Negozio(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static List<Prodotto> getProdotti() {
        return prodotti;
    }

    public static void setProdotti(List<Prodotto> nuoviProdotti) {
        prodotti = nuoviProdotti;
    }

    public void addProdotto(Prodotto prodotto, Integer quantita){
        if (prodotti.contains(prodotto)){
            prodotto.setQuantita(prodotto.getQuantita() + quantita);
        }
        else {
            prodotto.setQuantita(quantita);
            prodotti.add(prodotto);
        }
    }

    public void removeProdotto(Prodotto prodotto){
        prodotti.remove(prodotto);
    }

    public void stampaDisponibilita(){
        for (Prodotto p : prodotti){
            System.out.println("---------------");
            System.out.println("Prodotto: " + p.getNome() + "\n" +
                               "Quantità: " + p.getQuantita());
            System.out.println("---------------");
        }
    }

    public static boolean isPresentProdotto(Prodotto prodotto, Integer quantita){

            if (!Negozio.getProdotti().contains(prodotto)){
                System.out.println(prodotto + " non esiste");
                return false;
            }
            if (prodotto.getQuantita() < quantita){
                System.out.println("Non ci sono abbastanza " + prodotto);
                return false;
            }
        return true;
    }

    public static Double ammontareRata(Double prezzoTot, Integer numeroMesi){
        return prezzoTot / numeroMesi;
    }

}

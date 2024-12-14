package provaLinked;

import java.util.ArrayList;
import java.util.List;

public class ListaLinkata<T> {
    //classe annidata per il concetto di elemento dedlla lista
    private static class Elemento<T>{

        T valore;
        Elemento<T> next;

        public Elemento(T valore) {
            this.valore = valore;
            this.next = null;
        }

        public T getValore() {
            return valore;
        }

        public void setValore(T valore) {
            this.valore = valore;
        }

        public Elemento<T> getNext() {
            return next;
        }

        public void setNext(Elemento<T> next) {
            this.next = next;
        }
    }

    private Elemento<T> testa;

    //Metodi linked list

    public void addFirst(T valore){
        Elemento<T> newTesta = new Elemento<>(valore);
        newTesta.setNext(testa);
        this.testa = newTesta;
    }

    public T removeFirst(){
        if (testa == null){
            System.out.println("La lista è vuota");
            return null;
        }
        T oldTestaValue = testa.valore;
        testa = testa.next;
        return oldTestaValue;
    }

}

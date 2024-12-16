package Pila;

/*
queue = fifo, first in first out,
pila = lifo, last in first out.
 */

public class Pila<T> {
    public static class Elemento<T> {
        T value;
        Elemento<T> precedente;
        public Elemento(T value) {
            this.value = value;
            this.precedente = null;
        }
    }
    private Elemento<T> coda;

    public void push(T value){
        Elemento<T> oldCoda = coda;
        this.coda = new Elemento<>(value);
        this.coda.precedente = oldCoda;
    }
    public T pop(){
        if (coda == null){
            System.out.println("La pila è vuota");
            return  null;
        }
        Elemento<T> oldCoda = coda;
        this.coda = oldCoda.precedente;
        return  oldCoda.value;
    }
    public T peek(){
        if (coda == null){
            System.out.println("La pila è vuota");
            return  null;
        }
        return coda.value;
    }
}

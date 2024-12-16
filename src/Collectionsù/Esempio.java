package Collectionsù;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Esempio {
    public static void main(String[] args) {
        //l'HashSet non è sicuro che dia sempre lo stesso ordine
        Set<String> parole = new HashSet<>();
        //Il treeSet li mette in ordine alfabetico, in base al compareTo
        Set<String> paroleTree = new TreeSet<>();

        parole.add("Marco");
        paroleTree.add("Marco");
        parole.add("Java");
        paroleTree.add("Java");
        parole.add("Coding");
        paroleTree.add("Coding");

        System.out.println(paroleTree);
        System.out.println(parole);

    }
}

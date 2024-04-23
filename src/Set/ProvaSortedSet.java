package Set;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;
import Object.Persona;
public class ProvaSortedSet {

    public static void main(String[] args) {
        TreeSet<Persona> persone = new TreeSet<Persona>(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o2.getNome().compareTo(o1.getNome());
            }
        });

        Persona p1 = new Persona("Roberto", "Carli", 23);
        Persona p2 = new Persona("Roberta", "Carli", 24);
        Persona p3 = new Persona("Roberto", "Carlo", 23);
        Persona p4 = new Persona("Francesca", "Carli", 24);
        Persona p5 = new Persona("Francesca", "Carli", 24);

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);
        persone.add(p4);
        persone.add(p5);

        System.out.println(persone);
    }
}

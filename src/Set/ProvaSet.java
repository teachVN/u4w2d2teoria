package Set;

import java.util.HashSet;
import java.util.Set;

import Object.Persona;
public class ProvaSet {

    public static void main(String[] args) {
        Set<Persona> persone = new HashSet<Persona>();

        Persona p1 = new Persona("Roberto", "Carli", 23);
        Persona p2 = new Persona("Roberta", "Carli", 24);
        Persona p3 = new Persona("Roberto", "Carlo", 23);
        Persona p4 = new Persona("Francesca", "Carli", 24);
        Persona p5 = new Persona("Francesca", "Carli", 24);

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);
        System.out.println(persone.add(p4));

        System.out.println(persone);

        System.out.println(persone.add(p5));

        System.out.println(persone);

        for(Persona p : persone){
            System.out.println(p);
        }

    }
}

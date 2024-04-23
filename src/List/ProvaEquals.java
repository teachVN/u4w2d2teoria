package List;

import Object.Persona;
import java.util.ArrayList;

public class ProvaEquals {

    public static void main(String[] args) {
        ArrayList<Persona> persone = new ArrayList<>();

        Persona p1 = new Persona("Roberto", "Carli", 23);
        Persona p2 = new Persona("Roberta", "Carli", 24);
        Persona p3 = new Persona("Roberto", "Carlo", 23);
        Persona p4 = new Persona("Francesca", "Carli", 24);
        Persona p5 = new Persona("Francesca", "Carli", 24);

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);
        persone.add(p4);

        System.out.println(persone.contains(p5));
    }
}

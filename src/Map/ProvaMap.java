package Map;

import java.util.HashMap;
import java.util.Set;

import Object.Persona;

public class ProvaMap {
    public static void main(String[] args) {
        HashMap<String, Persona> anagrafe = new HashMap<String, Persona>();

        Persona p1 = new Persona("Roberto", "Carli", 23);
        Persona p2 = new Persona("Roberta", "Carli", 24);
        Persona p3 = new Persona("Roberto", "Carlo", 23);
        Persona p4 = new Persona("Francesca", "Carli", 24);
        Persona p5 = new Persona("Francesca", "Carli", 24);

        anagrafe.put("SNSDOIFWEF6DF", p1);
        anagrafe.put("WEOFIJSDSDF", p2);
        anagrafe.put("OIUDF098FDF", p3);

        System.out.println(anagrafe.get("oisdfijo"));

        System.out.println(anagrafe.get("OIUDF098FDF"));


        //cercare il codice fiscale collegato a p2
        Set<String> codiciFiscali=anagrafe.keySet();

        for(String chiave:codiciFiscali){
            Persona p = anagrafe.get(chiave);

            if(p==p2){
                System.out.println(chiave);
            }
        }

    }
}

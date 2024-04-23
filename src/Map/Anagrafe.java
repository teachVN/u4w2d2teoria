package Map;

import java.util.HashMap;
import java.util.Set;

import Object.Persona;
public class Anagrafe {

    private HashMap<String, Persona> anagrafe;

    public Anagrafe(){
        anagrafe = new HashMap<String, Persona>();
    }

    //aggiunge una coppia alla mappa
    public void aggiungiPersona(String cf, Persona persona){
        anagrafe.put(cf, persona);
    }

    //questo metodo rimuove una persona dalla mappa attraverso il codice fiscale
    public void rimuoviPersona(String cf){
        anagrafe.remove(cf);
    }

    //cerca una persona nella mappa dato il cf
    public Persona cercaPerCodiceFiscale(String cf){
        return anagrafe.get(cf);
    }

    public void stampaAnagrafe(){
        Set<String> chiavi = anagrafe.keySet();

        for(String cf:chiavi){
            System.out.println(cf + ": " +anagrafe.get(cf));
        }
    }
}

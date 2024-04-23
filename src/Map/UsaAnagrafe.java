package Map;
import Object.Persona;
public class UsaAnagrafe {
    public static void main(String[] args) {
        Anagrafe anagrafe = new Anagrafe();

        Persona p1 = new Persona("Roberto", "Carli", 23);
        Persona p2 = new Persona("Roberta", "Carli", 24);
        Persona p3 = new Persona("Roberto", "Carlo", 23);

        anagrafe.aggiungiPersona("EWFSD34SDFS", p1);
        anagrafe.aggiungiPersona("DSFOIU332D", p2);
        anagrafe.aggiungiPersona("DSFOIU332sdD", p3);

        anagrafe.stampaAnagrafe();

        anagrafe.rimuoviPersona("EWFSD34SDFS");

        anagrafe.stampaAnagrafe();
    }
}

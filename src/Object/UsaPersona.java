package Object;

public class UsaPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona("Roberto", "Carli", 23);
        Persona p2 = new Persona("Roberto", "Carli", 24);
        System.out.println(p1);

        System.out.println(p1.equals(p2));
        System.out.println(p1==p2);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}

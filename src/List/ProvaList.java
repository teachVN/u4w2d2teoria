package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ProvaList {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("5");
        lista.add("ciao");
        lista.add("true");

        System.out.println(lista.get(0));

        lista.set(2, "java");

        System.out.println(lista.size());

        lista.remove(0);

        System.out.println(lista.size());

        lista.remove("ciao");

        System.out.println(lista.isEmpty());

        System.out.println(lista.contains("java"));

        System.out.println(lista.indexOf("jav"));

        lista.add("css");
        lista.add("javascript");
        lista.add("javascript");
        lista.add("python");

        System.out.println(lista);

        lista.removeAll(List.of("java", "javascript", "html"));

        System.out.println(lista);

        for(String s:lista){
            System.out.println(s);
        }

        LinkedList<String> lista2 = new LinkedList<>();





    }
}

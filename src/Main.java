import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        lista1.add("2");
        lista1.add("3");
        lista1.add("4");

        List<String> lista2 = new ArrayList<>();
        lista2.add("5");
        lista2.add("2");
        lista2.add("dd");

        Set<String> lista3 = new HashSet<>();  //dodanie elementów dwoch list bez powtarzania
        lista3.addAll(lista1);
        lista3.addAll(lista2);

        System.out.println(lista3);

        List<Integer> lista4 = new ArrayList<>();

        for (String s : lista3)

            lista4.add(Integer.valueOf(s));        //zamiana lista3 ze String na Integer

        System.out.println(lista4);

        System.out.println(lista4.get(0)+ lista4.get(4));          //sprawdzenie czy są Integerami
    }
}

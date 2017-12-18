package pl.sda;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperatons {

    public static void main(String[] args) {
        Set<String> Hashset = new HashSet<>();
        fillset(Hashset);
        show(Hashset);

        System.out.println("------");

        Set<String>TreeSet = new TreeSet<>();
        fillset(TreeSet);
        show(TreeSet);

        System.out.println("------");

        Set<String>LinkedHashSet = new LinkedHashSet<>();
        fillset(LinkedHashSet);
        show(LinkedHashSet);
    }
    public static void fillset(Set<String>set){
        set.add("Adam");
        set.add("Beata");
        set.add("Celina");
        set.add("Dariusz");
        set.add("Elna");
        set.add("Franciszek");
    }

    public static void show(Set<String>set){
        for (String s:set) {
            System.out.println(s);
        }
    }
}

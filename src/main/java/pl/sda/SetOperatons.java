package pl.sda;

import java.util.*;

public class SetOperatons {

    public static void main(String[] args) {
        Set<String> Hashset = new HashSet<>();
        fillset(Hashset);
        show(Hashset);

        System.out.println("------");

        Comparator comparator = new Comparator();
        Set<String>TreeSet = new TreeSet<>(comparator);
        fillset(TreeSet);
        show(TreeSet);

        System.out.println("------");

        Set<String>LinkedHashSet = new LinkedHashSet<>();
        fillset(LinkedHashSet);
        show(LinkedHashSet);
    }
    public static void fillset(Set<String>set){
        set.add("Franciszek");
        set.add("Beata");
        set.add("Celina");
        set.add("Dariusz");
        set.add("Elna");
        set.add("Adam");
    }

    public static void show(Set<String>set){
        for (String s:set) {
            System.out.println(s);
        }
    }
}

class Comparator implements java.util.Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int size = o1.length() - o2.length();
        if(size != 0){
            return size;
        }else{
            return o1.compareTo(o2);
        }
    }
}

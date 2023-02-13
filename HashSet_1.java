import java.util.*;
public class HashSet_1 { 
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(7);
        set.add(9);
        System.out.println(set);
        
        set.remove(2);
        System.out.println(set);

        System.out.println(set.size());

        System.out.println(set.contains(4));
        System.out.println(set.contains(2));

        set.clear();
        System.out.println(set);

        // HashSet<Integer> sets = new HashSet<>();




    }
    
}

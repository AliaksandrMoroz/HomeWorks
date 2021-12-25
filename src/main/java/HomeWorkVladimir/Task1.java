package HomeWorkVladimir;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> intList1 = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));

        Set<Integer> integerSet1= new HashSet<>(intList1);
        List<Integer> intList2 = new ArrayList<>(integerSet1);

        integerSet1.addAll(intList1);
        intList2.addAll(integerSet1);

        Set<Integer> integerSet2 = intList1.stream().collect(Collectors.toSet());
        List<Integer> integerList3= integerSet2.stream().collect(Collectors.toList());



        Map<String, Integer> user = new HashMap<>(Map.of(
                "Sveta", 1,
                "Alex", 154,
                "Vasya", 12,
                "Adil", 3));
        Set<String> userName = new HashSet<>(user.keySet());



    }
}
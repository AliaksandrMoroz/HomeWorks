package TaskManual.Task29_30;


import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            list.add((int) (-15 + Math.random() * 10));
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {

            if(list.get(i)<0){
                list.remove(i);
        }
            }
        System.out.println(list);
        Set<Integer> listSet = new LinkedHashSet<>();
        listSet.addAll(list);
        System.out.println(listSet);
    }
}

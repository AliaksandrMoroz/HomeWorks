package StudentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    boolean flag=true;
    List<Student> students=new ArrayList<>();
    students.add(new Student("Andrey",3));
    students.add(new Student("Igor",5));
    students.add(new Student("Alex",6));
    students.add(new Student("Sofia",8));
        System.out.println(students);
       while (flag){
           Iterator<Student> studentIterator= students.iterator();
           studentIterator.hasNext();
       }
    }


}

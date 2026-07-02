package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main() {

        List<Student> students = new ArrayList<>();
        students.add( new Student(21, "Shikhar",2));
        students.add(new Student(22, "Gauri", 3));
        students.add(new Student(17,"Vinayak",5));
        students.add(new Student(27,"Srashty", 1));

        System.out.println(students);

//        List<Integer> list = new ArrayList<>();
//        list.add(8);
//        list.add(45);
//        list.add(4);
//        list.add(90);
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);
    }
}

package JavaCollection;


import java.util.*;


public class Framework {;
    static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(28);
        list.add(9);
        list.add(7);
        list.add(6);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.remove(2));
        System.out.println("List 1 : " + list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(12);
        list2.add(67);
        list2.add(37);
        list2.add(93);
         list.addAll(list2);
        System.out.println("List 2 : " + list2);
        System.out.println("List 3 : " + list);

        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list2);
        list2.clear();
        System.out.println(list2.size());

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        System.out.println(list3.get(2));

        System.out.println("before setting : " + list3);
        list3.set(0,100);
        System.out.println("after setting : " + list3);

        for (Object o : list3.toArray()) {
            System.out.println(o);

        }
        System.out.println(list3.contains(100));

        Collections.sort(list3);
        System.out.println("Sorted : " + list3);

        ArrayList<Integer> newList = (ArrayList<Integer>) list3.clone();
        System.out.println("New List : " + newList);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(50);
        System.out.println(marks.isEmpty());
        System.out.println(newList.indexOf(100));

    }



}

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class HashMapBascis{
         static void main(String[] args) {
            Map<Integer, String> map = new HashMap<>();
            map.put(1,"Srashty");
            map.put(2 , "Gauri");
            map.put(3 ,"Shikhar");
            System.out.println(map);

            Map<Integer, String> map2 = new HashMap<>();
            map2.put(4, "Chotu");

            System.out.println(map2);

            map2.putAll(map);
            System.out.println(map2);


            map2.remove(1);
            System.out.println(map2);

            System.out.println(map2.get(3));

            map2.putIfAbsent(1, "yashi");
            System.out.println(map2);

            System.out.println(map2.getOrDefault(5,"noo one"));

            System.out.println(map2.containsKey(5));

            System.out.println(map2.containsValue("Chotu"));


            System.out.println(map2);
            map2.replace(1,"jackiee");
            System.out.println(map2);

//
//             Set<Integer> Keyset = map2.KeySet();
//             System.out.println(Keyset);

        Collection<String> value = map2.values();
        System.out.println(value);


        }


        //System.out.println(map2.size());
        //map2.clear();
        //System.out.println(map2.size());

    }




package ArraysProblems;

import java.util.HashSet;
import java.util.Set;

public class Union {
    static void unionArray(int arr[] ,int arr1[]) {

        Set<Integer> set = new HashSet<>();
         for( int a : arr){
             set.add(a);
         }
         for(int b : arr1){
             set.add(b);
         }
         for(int c : set){
             System.out.println(c);

         }
    }
    static void main() {
        int arr[] ={2,4,6,8};
        int arr1[] = {1,8,5,4};
        unionArray(arr,arr1);

    }
}



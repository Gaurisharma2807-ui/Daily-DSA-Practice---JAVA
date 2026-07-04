import java.util.ArrayList;
import java.util.List;

public class sumOfColums2DArray {

    public static List<Integer> colSum(int[][] arr){
        List<Integer> result = new ArrayList<>();
         int n = arr.length;
         int m = arr[0].length;

         for(int col =0 ;col < m ;col++){
             int sum =0;
             for(int row=0;row< n ;row++){
                 int value = arr[row][col];
                 sum = sum + value;

             }
             result.add(sum);
         }
         return result;
    }


    static void main() {
        int[][] arr ={{1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(colSum(arr));

    }
}

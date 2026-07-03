import java.util.ArrayList;
import java.util.List;

public class findMissingElement {

    public static List<Integer> findDisappearNo(int[] arr){
        List<Integer> ans = new ArrayList<>();

        int n  = arr.length;
        for(int i =0;i<n ;i++){
            int val = Math.abs(arr[i]);
            int positon = val - 1;

            if(arr[positon]> 0){
                arr[positon] = - arr[positon];
            }
        }

        for(int j =0;j<n ;j++){
            if(arr[j]>0 ){
                int valAtThisIndex= j+1;
                ans.add(valAtThisIndex);
            }
        }
        return ans;
    }
    static void main() {
        int arr[] ={ 1,2,2,4,4,5};
        System.out.println(findDisappearNo(arr));
    }
}

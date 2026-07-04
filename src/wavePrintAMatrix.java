import java.util.ArrayList;
import java.util.List;

public class wavePrintAMatrix {
    public static List<Integer> waveMatrix(int[][] arr ,int m,int n){

        List<Integer> output = new ArrayList<>();

        for(int col =0 ;col<n;col++){
            if((col & 1)== 1){
                for( int row=m-1 ;row<=0;row++){
                    output.add(arr[row][col]);
                }
            }else{
                for(int row=0;row<m ;row++){
                    output.add(arr[row][col]);
                }
            }
        }
       return output;
    }

    static void main() {
        int[][] arr ={{3,4,5,6},
                     {6,7,8,4},
                     {2,9,0,9}

        };
        System.out.println(waveMatrix(arr,3,4));
    }
}

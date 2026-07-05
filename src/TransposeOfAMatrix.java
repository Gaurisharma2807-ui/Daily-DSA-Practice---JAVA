public class TransposeOfAMatrix {

    public static int[][] Transpose(int[][] arr){
        if(arr == null || arr.length==0){
            return arr;
        }

        int rows = arr.length;
        int cols = arr[0].length;

        int[][] transpose = new int[cols][rows];

        for(int i=0;i<rows ;i++){
            for(int j=0 ;j< cols; j++){
                transpose[j][i] =arr[i][j];
            }
        }
        return transpose;
    }
   static void main() {
        int [][] arr ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Transpose(arr));

    }
}

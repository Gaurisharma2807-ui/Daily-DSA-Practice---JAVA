public class rotateMatrixBy90 {
    public static void rotate(int[][] arr){
        int n= arr.length;
        for(int i=0; i<n ;i++){
            for(int j=i+1; j<n ; j++){
                int temp =arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        for(int row=0;row<n;row ++){
            int stCol =0;
            int endCol = n-1;
            while(stCol<=endCol){
                int temp = arr[row][stCol];
                arr[row][stCol]=arr[row][endCol];
                arr[row][endCol] =temp;
                stCol++;
                endCol--;
            }
        }

    }


    static void main() {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);

        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }


    }
}

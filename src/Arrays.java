import java.util.Scanner;

public class Arrays {
    static void main() {


    int arr[][] = new int[3][4];
    Scanner sc = new Scanner(System.in);

    for(int i=0;i<=arr.length-1;i++)

    {
        for (int j = 0; j <= arr[i].length-1; j++) {
            System.out.println("Provide value for row=" + i +"and column=" + j );
            arr[i][j] = sc.nextInt();
        }
    }
    //print
        for (int rowIndex =0;rowIndex<=arr.length-1;rowIndex++){
            for(int colIndex=0;colIndex<=arr[rowIndex].length-1;colIndex++ ){
                System.out.print(arr[rowIndex][colIndex] +" ");
            }
            System.out.println();
        }


//        int arr[] = {3,2,-5,21,16};
//        int n = arr.length;
//        int minValue = arr[0];
//         for(int i=0;i<=n-1;i++){
//             if(arr[i]<minValue){
//                 minValue = arr[i];
//             }
//         }
//        System.out.println(minValue);

//        int arr[] ={3, 2,-5,21,15};
//        int n = arr.length;
//        int maxValue = arr[0];
//
//        for(int i=0;i<=n-1;i++){
//            if(arr[i]>maxValue){
//                maxValue=arr[i];
//            }
//        }
//        System.out.println(maxValue);



//        int arr[] = {2, 3, 45, 60};
//        int ans = 1;
//         int n = arr.length;
//
//         for(int i=0;i<=n-1;i++){
//             int value = arr[i];
//             ans = ans * value;
//         }
//        System.out.println(ans);



//        int arr[] = {10,20,30,40,50};
//        int sum =0;
//        int n= arr.length;
//
//        for(int i=0;i<=n-1;i++){
//            int value = arr[i];
//            sum = sum + value;
//        }
//        System.out.println(sum);


//        int arr[] = new int [5];
//        Scanner sc = new  Scanner(System.in);
//        int n = arr.length;
//        for(int i =0; i<=n-1;i++){
//            System.out.println("provide input for index " + i);
//            arr[i] = sc.nextInt();
//        }
//        //print
//        System.out.println("your array contains: ");
//        for(int val: arr){
//            System.out.println(val);
//        }

//        //declaration
//        int arr[];
//        //allocation
//        arr = new int [5];
//        //init
//        int brr[] = {10,20,30,};
//        int n = brr.length;
//        for (int val: brr){
//            System.out.println(val);
//        }

//        for(int index=0;index<=n-1;index++){
//            System.out.println(brr[index]);
//        }

//        System.out.println(brr[0]);
//        System.out.println(brr[1]);
//        System.out.println(brr[2]);
//
//
    }
}

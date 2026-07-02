package ArraysProblems;

public class ArrayManipulationTechnique {
    // sort 0 1 and2
    public static void sort012(int[] arr) {
        int i = 0;
        int k = 0;
        int j = arr.length - 1;
        while (k<=j ){
            if( arr[k]==0){
                int temp =arr[i];
                arr[i] =arr[k];
                arr[k] = temp;
                i++;
                k++;
            }
            else if(arr[k]==1){
                k++;
            }
            else{
                int temp1 = arr[k];
                arr[k] = arr[j];
                arr[j] = temp1;
                j--;

            }
        }
        for(int a: arr){
            System.out.println(a);
        }

    }
    static void main(){
        int [] arr ={2,1,0,2,1,0,1};
        sort012(arr);
        }
}


    //Sort the array by 0's and 1's
//    public static void sortBy0and1(int[] arr){
//        int i=0;
//        int j= arr.length-1;
//        while(i<j) {
//            if (arr[i] == 1 && arr[j] == 0) {
//                arr[i] = 0;
//                arr[j] = 1;
//            }
//            if (arr[i] == 0) {
//                i++;
//            }
//            if (arr[j] == 1) {
//                j--;
//            }
//        }
//        for(int n : arr){
//            System.out.println(n);
//        }
//    }
//    static void main() {
//        int[] arr ={1,0,1,0,0,1,1};
//        sortBy0and1(arr);
//
//    }
//}



    //reverse the array
//    static  void  reverseArray(int arr[]){
//        int i=0;
//        int j= arr.length-1;
//        while(i<=j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//            i++;
//            j--;
//        }
//        for(int k: arr){
//            System.out.println(k);
//        }
//    }
//     // element shift by one
//    static void shiftElementBy1(int arr[]) {
//        int temp = arr[arr.length - 1];
//
//        for (int   i = arr.length - 1; i > 0; i--) {
//            arr[i] = arr[i - 1];
//        }
//        arr[0] = temp;
//    }


    //print extreme elements
//    static void extremeAlternateElement(int arr[]) {
//        int     i = 0;
//        int j = arr.length - 1;
//
//        while (i <= j) {
//            System.out.println(arr[i] + " " + arr[j]);
//            i++;
//          j--;
//        }
//    }



//        static void main() {
//            int arr[] ={ 1,5,6,2};
//            int arr1[] ={7,4,2,5};
//            unionArray(arr,arr1);

//
//        int arr[] ={2,4,6,7,9,0};
//        int arr[] ={10,20,30,40,50,60};
//       shiftElementBy1(arr);
//        for(int a: arr){
//           System.out.print(a + " ");
//        }
//
//
//       int arr[] = {2,4,6,8,5};
//       reverseArray(arr);
//   }
//}

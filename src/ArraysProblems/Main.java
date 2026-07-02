package ArraysProblems;


public class Main {
    static double getAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum = sum + arr[i];

        }
        double avg = sum / arr.length;
        return avg;
    }

    static int[] getMultiply(int[] arr) {
        int size = arr.length;
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;

    }

    static boolean searchElement(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    static int getMaxElement(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }


    static int sumPosNeg(int arr[]) {
        int PosNum = 0;
        int NegNum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                PosNum = PosNum + arr[i];
            } else {
                NegNum = NegNum + arr[i];
            }

        }
        System.out.println(PosNum);
        System.out.println(NegNum);
        return 1;
    }

    static int countZeroOnes(int arr[]) {
        int zeroes = 0;
        int ones = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroes++;
            } else {
                ones++;
            }
        }
        System.out.println(zeroes + "," + ones);
        return 1;
    }

    static int unsortedElement(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] <= arr[i]) {
                return arr[i + 1];
            }

        }
        return 1;
    }

    static int swapAlternateElement(int arr[]) {

        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int val : arr) {
            System.out.print(val + ",");
        }
        return 0;
    }

    static int arrayIntersection(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr2[j]);
                }

            }
        }

        return 0;

    }

    static void  printExtremeElement(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            System.out.println(arr[i] + "  " + arr[j]);
            i++;
            j--;
        }

    }
      static void main(){
            int arr[] ={2,5,3,7,4,8};
            printExtremeElement(arr);






//       int[] arr1 ={1,3,5,2};
//       int[] arr2 ={0,4,9,6};
//       arrayIntersection(arr1,arr2);




//        int arr[] ={1,3,5,2,7};
//        System.out.println(unsortedElement(arr));

//        int arr[] ={1,0,1,1,0,0};
//         countZeroOnes(arr);


//        int arr[] = {2,-7,4,-3,-5,2};
//         sumPosNeg(arr);
//
//        System.out.println(ans[0]);
//        System.out.println(ans[1]);
//
//        int arr[] ={4,6,3,7,3};
//        System.out.println(getMaxElement(arr));
//        int arr[] ={1,2,3,4,5};
//        int ans[] = getMultiply(arr);
//        for(int i : ans) {
//            System.out.println(i);
//        }

//        int arr[] = { 1,5,3,6,};
//        System.out.println(getAverage(arr));

    }
}

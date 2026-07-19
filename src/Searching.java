public class Searching {
    public static int binarySearch(int[] arr, int target){
        int n = arr.length;
        int s=0;
        int e= n-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]== target){
                return mid;
            }else if (target > arr[mid]){
                s= mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;

    }

    static void main() {
        int [] arr ={10,20,30,40,50,60};
        int target = 50;
        System.out.println(binarySearch(arr,target));

    }
}

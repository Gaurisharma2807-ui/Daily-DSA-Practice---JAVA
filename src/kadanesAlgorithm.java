public class kadanesAlgorithm {
    public static int maxSubArray(int arr[]){
        int sum =0;
        int maxSum =Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            sum = sum + arr[i];

            maxSum =Math.max(maxSum,sum);

            if(sum<0){
                sum =0;
            }
        }
        return maxSum;
    }
    static void main() {
        int arr[] ={ -2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}

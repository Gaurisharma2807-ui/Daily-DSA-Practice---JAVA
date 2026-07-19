//
//    void main() {
//        int a=2 ;
//        int b=5 ;
//
//        if(a!=b){
//            System.out.println("true");
//
//        }else {
//            System.out.println("false");
//        }

public class Basic {
    public static int[] rearrange(int[] arr){
        int n = arr.length;
        int i =0;
        int j=i+1;
        while(i<n-1){
            if(arr[i]>arr[j]){
                i++;
                j++;
            }else{
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        for(int a :arr){
            System.out.println(a);
        }
        return arr;
    }

    static void main() {
        int[] arr ={3,1,-2,-5,2,-4};
        System.out.println(rearrange(arr));

    }
}


    //basic addition, sub , mul , div, mod
//    public static void main(String[] args) {
//
//        int ratingPoints = 100;
//
//        ratingPoints += 20;
//        System.out.println(ratingPoints);// ratingPoints = ratingPoints + 20
//        ratingPoints -= 10;
//        System.out.println(ratingPoints);// ratingPoints = ratingPoints - 10
//        ratingPoints *= 2;
//        System.out.println(ratingPoints);// ratingPoints = ratingPoints * 2
//        ratingPoints /= 4;
//        System.out.println(ratingPoints);// ratingPoints = ratingPoints / 4
//        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30
//
//        System.out.println(ratingPoints);
//    }
//}
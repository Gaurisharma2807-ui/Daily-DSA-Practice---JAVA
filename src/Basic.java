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
//    }

public class Basic {
    public static void main(String[] args) {

        int ratingPoints = 100;

        ratingPoints += 20;
        System.out.println(ratingPoints);// ratingPoints = ratingPoints + 20
        ratingPoints -= 10;
        System.out.println(ratingPoints);// ratingPoints = ratingPoints - 10
        ratingPoints *= 2;
        System.out.println(ratingPoints);// ratingPoints = ratingPoints * 2
        ratingPoints /= 4;
        System.out.println(ratingPoints);// ratingPoints = ratingPoints / 4
        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30

        System.out.println(ratingPoints);
    }
}
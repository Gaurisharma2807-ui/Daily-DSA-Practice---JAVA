import java.util.Scanner;
public class loopshw {
    static void main() {
        for(int i=0;i<=100;i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    System.out.println(i);
                }
            }

        }


        //ques 8
//        System.out.println("integers that are perfectly divisible by 7");
//        for(int i=50;i<=100;i++){
//            if(i%7==0){
//                System.out.println(i);
//            }
//        }

        //ques 7
//     int n;
//     int sum=0;
//        Scanner sc =new Scanner(System.in);
//        System.out.println("sum of all numbers 1 to n");
//        n=sc.nextInt();
//        for(int i=0;i<=n;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);
//

   ; // ques 6
//        static void main() {
//            int n=2;
//            System.out.println("even numbers 1 to 100");
//            for (int i=1;i<=50;i++){
//
//                System.out.println(n*i);
//            }


//            i = 2;
//
//            while(i%i==0){
//
//                    System.out.println("prime numbers 1 to 100" + i);
//                    i++;
//                }
//



//    Scanner sc =new Scanner(System.in);
//            System.out.println("enter your name");
//            String name;
//            name=sc.nextLine();
//            for(int i=0;i<=100;i++){
//                System.out.println(name);
//            }


    //ques 3

//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter the value of n:");
//        int n =sc.nextInt();
//        System.out.println("multiple of " + n+ "till 10");
//        for(int i=1;i<=10;i++){
//            System.out.println(n*i);
//        }


        //ques 2
//                Scanner sc= new Scanner(System.in);
//        System.out.println("enter the value of n:");
//        int n= sc.nextInt();
//        System.out.println("numbers from n to 1:" );
//
//        for(int i=n;i>=1;i--){
//            System.out.println(i);
//        }


       //       ques 1
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter the value of n:");
//        int n= sc.nextInt();
//        System.out.println("numbers from 1to n:" );
//
//        for(int i=1;i<=n;i++){
//            System.out.println(i);
//        }
    }
}

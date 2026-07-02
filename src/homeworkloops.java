import java.util.Scanner;

public class homeworkloops {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter marks of 1st subject");
        int s1 =sc.nextInt();
        System.out.println("enter marks of 2nd subject");
        int s2 =sc.nextInt();
        System.out.println("enter marks of 3rd subject");
        int s3 =sc.nextInt();
        System.out.println("enter marks of 4th subject");
        int s4 =sc.nextInt();
        System.out.println("enter marks of 5th subject");
        int s5 =sc.nextInt();

        if(s1<s2 && s1<s3 && s1<s4 && s1<s4){
            System.out.println("percentage " + (s2+s3+s4+s5/4));
        }else if (s2<s3&&s2<s4&&s2<s5){
            System.out.println("percantage" + (s1+s3+s4+s5)/4);
        }else if(s3<s4&& s3<s5){
            System.out.println("percenatage" +(s1+s2+s4+s5)/4);
        }else if(s4<s5){
            System.out.println("percentage" +(s1+s2+s3+s5)/4);
        }else{
            System.out.println("percentage" +(s1+s2+s3+s4)/4);
        }










//            int marks5 = sc.nextInt();
//
//            int percentage = (marks1+marks2+marks3+marks4+marks5)/5;
//        System.out.println("percenatge:"+percentage);

//int a=0;
//        System.out.println("Enter the marks of 5 students:");
//        for(int i=1;i<=5;i++){
//            Scanner sc = new Scanner(System.in);
//            int marks=sc.nextInt();
//            a =a +marks;
//        }
//        int percentage=a/5;
//        System.out.println(percentage);

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the lowercase character");
//
//        char lowerCase =sc.next().charAt(0);
//        System.out.println((char)(lowerCase-32));


//        System.out.println("Enter the uppercase letter");
//        Scanner sc = new Scanner(System.in);
//        char upperCase =sc.next().charAt(0);
//        System.out.println((char)(upperCase+32));









    }



//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age:");
//        int age= sc.nextInt();
//         if(age>=18){
//             System.out.println("eligible to vote");
//         }else{
//             System.out.println("not eligible to vote");
//         }

//
//            System.out.println("Enter the marks of first subject:");
//            int marks1 = sc.nextInt();
//            System.out.println("Enter the marks of second subject:");
//            int marks2 = sc.nextInt();
//            System.out.println("Enter the marks of third subject:");
//            int marks3 = sc.nextInt();
//            System.out.println("Enter the marks of fourth subject:");
//            int marks4 = sc.nextInt();
//            System.out.println("Enter the marks of fif
}

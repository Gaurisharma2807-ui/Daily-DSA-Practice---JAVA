import java.util.Scanner;

public class TakingInput {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for firstNum:");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value of secondNum:");
        int secondNum = sc.nextInt();
        int ans = firstNum+secondNum;
        System.out.println("Answer is:" + ans);

        boolean bg= sc.nextBoolean();
        System.out.println("boolean:" + bg);

    }
}

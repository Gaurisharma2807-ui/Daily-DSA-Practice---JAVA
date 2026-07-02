public class BasicMaths {
    static void printDigits( int num){

        while(num !=0){
            int digit = num%10;
            System.out.println(digit);
            num = num /10;
        }
    }


    static  int countDigit(int num){
        int count = 0;
        while(num!=0){
            int digit = num%10;
            count++;

            num = num/10;
        }
        return count;
    }

    static  int sumOfDigit(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum = sum +digit;

            num = num/10;
        }
        return sum;
    }


    static int reverseNum(int num){
        int revNum= 0;
        while(num!=0){
            int digit = num % 10;
            revNum= revNum*10+digit;
            num = num/10;
        }
        return revNum;
    }

    static void main() {
//          int num = 51367;
//          int revNum= reverseNum(num);
//        System.out.println(revNum);
//          int sum = sumOfDigit(num);
//        System.out.println(sum);

        int num = 2536;
        int ans= countDigit(num);
        System.out.println(ans);
       // printDigits(num);
    }
}

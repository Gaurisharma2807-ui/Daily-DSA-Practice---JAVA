import java.security.spec.RSAOtherPrimeInfo;

public class StringsBasics {
    static void printString(String str){
        int n= str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getLengthOfString(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;

    }
    static int getVowelsCount(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch =='a' || ch =='e' || ch == 'i' || ch=='o' || ch=='u' || ch =='A' || ch =='E' || ch == 'I' || ch=='O' || ch=='U'){
            }else{
                count++;
            }
        }
        return count;
    }

    static String reverseString(String str){
        String reverse ="";
        int n = str.length();
        for (int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;

    }
    static boolean isPalindrome(String str){
        String original = str;
        String reverse = reverseString(original);
        //compare
        for(int i=0;i<original.length();i++){
            char ch1 =original.charAt(i);
            char ch2 =reverse.charAt(i);
            if(ch1!=ch2){
                return false;
            }
        }
        return true;
    }



    static String wordCount(String str) {
        System.out.println(str.length());
        return str;
    }

    static String removeSpace(String str){
        System.out.println(str.length());
        str = str.trim();
        System.out.println(str.length());
        return str;
    }





    static void main() {
        String str = "  name ";
        System.out.println(removeSpace(str));
        //System.out.println(wordCount(str));
        //System.out.println(isPalindrome(str));
       // System.out.println(reverseString(str));
        //System.out.println(getVowelsCount(str));
     //  System.out.println(getLengthOfString(str));
        //printString(str);
    }

}

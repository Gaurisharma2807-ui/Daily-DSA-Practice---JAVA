public class Methods {
    static void updateValue(int x){
        x=x+10;
        System.out.println("updated value: " + x);
    }



//    static void display(int a ){
//        System.out.println(a);
//    }
//
//    static void display(String text){
//        System.out.println(text);
//    }

//    static int calculatePercentage(int obtained,int total){
//        if(total==0){
//            return 0;
//        }
//        return (obtained*100)/total;
//
//    }


//    static void getMax(int a, int b){
//        if(a>b){
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }
//    }


//    static void isEven(int num){
//        System.out.println("even numbers");
//        for(int i=1;i<=num+2;i++){
//
//            System.out.println( 2*i);
//        }
//    }

//    static void add(int x, int y){
//        int sum = x+y;
//        System.out.println("sum=" + sum);
//    }

//    static void printWelcomeMessage(){
//        System.out.println("hellooo, my loveee shikkal");
//    }
    static void main() {
        int num=50;
        System.out.println(" value " + num);
        updateValue(num);
        System.out.println(" unchanged value " + num);
//        display(20);
//        display("gauri");

//        int obtained = 450;
//        int total = 500;
//
//        int percentage = calculatePercentage(obtained, total);
//        System.out.println("percentage=" + percentage + "%");

       // getMax(4,6);

        // isEven(200);
        //   add(5, 6);
        //printWelcomeMessage();
    }
}

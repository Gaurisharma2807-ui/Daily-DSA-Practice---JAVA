//package Abstraction;
//
//abstract class Bird{
//    abstract void fly();
//
//    abstract void Eat();
//    abstract void Bath();
//    abstract void Sleep();
//}
//class Sparrow extends Bird {
//
//    @Override
//    void fly() {
//        System.out.println("Sparrow is flying.....");
//
//    }
//    @Override
//    void Eat(){
//        System.out.println("Sparrow is Eating.....");
//
//    }
//    @Override
//    void Bath(){
//        System.out.println("Sparrow is Bathing.....");
//    }
//    @Override
//    void Sleep(){
//        System.out.println("Sparrow is sleeping........");
//    }
//}
//class Crow extends Bird {
//
//    @Override
//    void fly() {
//        System.out.println("Crow is flying.....");
//
//    }
//
//    @Override
//    void Eat() {
//        System.out.println("Crow is Eating.....");
//
//    }
//
//    @Override
//    void Bath() {
//        System.out.println("Crow is Bathing.....");
//    }
//
//    @Override
//    void Sleep() {
//        System.out.println("Crow is Sleeping.....>.<");
//    }
//}
//public class Main {
//
//
//    static void doStuffs(Bird b) {
//        b.fly();
//        b.Eat();
//        b.Bath();
//        b.Sleep();
//
//
//    }
//    static void main() {
//       doStuffs(new Sparrow());
//       doStuffs(new Crow());
//
//    }
//
//}
package Abstraction;

interface Bird{
     void fly();

     void Eat();
     void Bath();
     void Sleep();
}
class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Sparrow is flying.....");

    }
    @Override
    public void Eat(){
        System.out.println("Sparrow is Eating.....");

    }
    @Override
    public void Bath(){
        System.out.println("Sparrow is Bathing.....");
    }
    @Override
    public void Sleep(){
        System.out.println("Sparrow is sleeping........");
    }
}
class Crow implements Bird {

    @Override
    public void fly() {
        System.out.println("Crow is flying.....");

    }

    @Override
    public void Eat() {
        System.out.println("Crow is Eating.....");

    }

    @Override
    public void Bath() {
        System.out.println("Crow is Bathing.....");
    }

    @Override
    public void Sleep() {
        System.out.println("Crow is Sleeping.....>.<");
    }
}
public class Main {


    static void doStuffs(Bird b) {
        b.fly();
        b.Eat();
        b.Bath();
        b.Sleep();


    }
    static void main() {
       doStuffs(new Sparrow());
       doStuffs(new Crow());

    }

}

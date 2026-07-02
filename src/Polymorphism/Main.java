package Polymorphism;

public class Main {
    static void main() {
        Calc c= new Calc();
        System.out.println(c.add(3 ,7));
        System.out.println(c.add(3.5,5));
        System.out.println(c.add(34,65,76));

        Animal a;

        a = new Dog();
        a.sound(); // Output: Dog barks

        a = new Cat();
        a.sound(); // Output: Cat meows
    }
}
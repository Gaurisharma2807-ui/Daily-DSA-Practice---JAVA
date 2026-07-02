package Transport;

public class Main {
    static void main() {
        Car c = new Car("Maruti", "800", 4 ,4, "Auto");
        c.startEngine();
        c.startAC();
        c.stopEngine();


        MotorCycle m = new MotorCycle("splendor", "7", 2,"2","auto");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
        m.wheelie();
    }
}

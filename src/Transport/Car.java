package Transport;

public class Car extends Vehicle{
    public int noOfDoors;
    public String transmissionSize;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionSize){
        super(name,model,noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionSize = transmissionSize;
        super.startEngine();
    }

    public void startAC(){
        System.out.println("AC started of " + name );
    }
}

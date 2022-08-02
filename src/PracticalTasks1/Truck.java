package PracticalTasks1;

public class Truck extends Car{

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }
    @Override
    public String toString() {
        return ("Truck info: "+getModel()+", Max speed: "+getMaxSpeed()+", Year of manufacture: "+getYearOfManufacture());
    }
    @Override
    public void printInfo(){
        System.out.println("General info about truck");
    }

    @Override
    public void run() {
        System.out.println("The truck is run!");
    }
    @Override
    public void stop(){
        System.out.println("The truck is stop!");
    }



}

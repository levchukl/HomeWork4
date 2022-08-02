package PracticalTasks1;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }
    @Override
    public String toString() {
        return ("Sedan info: "+getModel()+", Max speed: "+getMaxSpeed()+", Year of manufacture: "+getYearOfManufacture());
    }
    @Override
    public void printInfo(){
        System.out.println("General info about sedan");
    }
    @Override
    public void run() {
        System.out.println("The sedan is run!");
    }
    @Override
    public void stop(){
        System.out.println("The sedan is stop!");
    }
}

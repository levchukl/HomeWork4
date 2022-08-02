package PracticalTasks1;

public abstract class Car {


    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
    @Override
    public String toString() {
            return ("Car info: "+model+", Max speed: "+maxSpeed+", Year of manufacture: "+yearOfManufacture+" ");
    }

    public void printInfo(){
        System.out.println("General info about car");
    }
        public  void run(){
            System.out.println("Go");
        };
        public  void stop(){
            System.out.println("Stop");
        };


}

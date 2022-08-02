package PracticalTasks1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car ford= new Truck("Ford", 120, 2022);
        Car volvo=new Truck("Volvo", 155, 2021);
        Car opel=new Truck("Opel", 160, 2020);
        Car mazda= new Sedan("Mazda", 180, 2020);
        Car honda =  new Sedan("Honda", 170, 2023);
        List<Car>cars=new ArrayList<>();
        cars.add(ford);
        cars.add(volvo);
        cars.add(opel);
        cars.add(mazda);
        cars.add(honda);
        for (Car a : cars){
            String info = a.toString();
            System.out.println(info);

        }

    }
}

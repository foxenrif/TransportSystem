package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("John Doe", 10);
        Engine engine = new Engine(400, "Mercedes");

        Car car = new Car("BMW", "Sedan", 1500, driver, engine);
        Lorry lorry = new Lorry("Volvo", "Truck", 5000, driver, engine, 12000);
        SportCar sportCar = new SportCar("Ferrari", "Sports", 1200, driver, engine, 300);

        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);

        car.start();
        car.turnLeft();
        car.stop();
    }
}

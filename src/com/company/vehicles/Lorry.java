package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int loadCapacity;

    public Lorry(String brand, String carClass, int weight, Driver driver, Engine engine, int loadCapacity) {
        super(brand, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", loadCapacity=" + loadCapacity;
    }
}

package org.example;

import org.springframework.beans.factory.annotation.Value;

public class BigCar implements Car {
    @Value("${bigCar.model}")
    String model;
    @Value("${bigCar.name}")
    String name;


    @Override
    public String toString() {
        return "BigCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String GetSound() {
        return  sound+" I am "+name+"-"+model;
    }
    public BigCar() {

    }
    public BigCar(String model, String name) {
        this.model = model;
        this.name = name;
    }
}

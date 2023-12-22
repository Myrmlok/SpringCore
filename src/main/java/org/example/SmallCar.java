package org.example;

import org.springframework.beans.factory.annotation.Value;

public class SmallCar implements Car{
    public String sound="bip-bip";
    @Value("${smallCar.name}")
    public String name;
    @Value("${smallCar.model}")
    public String model;
    @Override
    public String GetSound() {
        return  sound+" I am "+name+"-"+model;
    }

    @Override
    public String toString() {
        return "SmallCar{" +
                "sound='" + sound + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public SmallCar() {
    }

    public SmallCar(String name, String model) {
        this.name = name;
        this.model = model;
    }
}

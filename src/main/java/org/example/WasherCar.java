package org.example;

import java.util.List;
import java.util.Random;

public class WasherCar {
    List<Car> car;

    @Override
    public String toString() {
        return "WasherCar{" +
                "car=" + car +
                '}';
    }

    public WasherCar(List<Car> car) {
        this.car = car;
    }
    public void SayCar(){
        Random r=new Random();
        System.out.println(car.get(r.nextInt(0, car.size())).GetSound());
    }
}

package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(ConfigApp.class)){
            contex.getBean("washerCar", WasherCar.class).SayCar();
            System.out.println( contex.getBean("cars", List.class));
        }
    }
}

package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Configuration
@PropertySource("/application.properties")
public class ConfigApp {
    @Value("#{'${ArrayCar.names}'.split(',')}")
    List<String> arrayNames;
    @Value("#{'${ArrayCar.models}'.split(',')}")
    List<String> arrayModels;
    @Value("#{'${ArrayCar.types}'.split(',')}")
    List<String> types;
    @Bean
    public BigCar bigCar(){
        return new BigCar();
    }
    @Bean
    public SmallCar smallCar(){
        return new SmallCar();
    }
    @Bean
    public WasherCar washerCar(){
        return new WasherCar(Arrays.asList(bigCar(),smallCar()));
    }
    @Bean
    public List<Car> cars(){
        ArrayList<Car> cars=new ArrayList<>();
        System.out.println(arrayModels);
        System.out.println(arrayNames);
        for(int i=0;i<arrayModels.size();i++){
            System.out.println(types.get(i));
            if(Objects.equals(types.get(i), "Big")){
                cars.add(new BigCar(arrayNames.get(i), arrayModels.get(i)));
            }
            else{
                cars.add(new SmallCar(arrayNames.get(i), arrayModels.get(i)));
            }
        }
        return cars;
    }
}

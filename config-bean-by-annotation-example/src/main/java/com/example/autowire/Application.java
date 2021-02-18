package com.example.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

//        ---------------------------Autowire
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = (Car) applicationContext.getBean("car");

        if (car.getEngine() != null) {
            System.out.println(car.getEngine().getCode());
        }

    }
}

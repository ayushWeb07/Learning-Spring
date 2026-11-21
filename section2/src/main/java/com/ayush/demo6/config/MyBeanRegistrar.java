package com.ayush.demo6.config;

import com.ayush.demo6.beans.Car;
import com.ayush.demo6.beans.Coffee;
import com.ayush.demo6.beans.Engine;
import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.core.env.Environment;

import java.util.Random;

public class MyBeanRegistrar implements BeanRegistrar {
    @Override
    public void register(BeanRegistry registry, Environment env) {
        int n = new Random().nextInt(10) + 1;

        // even: create beans: engine -> car
        if (n % 2 == 0) {
            // register engine bean
            registry.registerBean("engine", Engine.class, engineSpec -> engineSpec.supplier(supplierContext -> {
                var engine = new Engine();
                engine.setName("V12 Turbo");
                return engine;
            }));

            // register car bean
            registry.registerBean("car", Car.class, carSpec -> carSpec.supplier(supplierContext -> {
                var car = new Car(supplierContext.bean(Engine.class));
                car.setName("Aston Martin DB12");
                return car;
            }));
        }

        // odd: create beans: coffee
        else {
            // register coffee bean
            registry.registerBean("coffee", Coffee.class, coffeeSpec -> coffeeSpec.supplier(
                    supplierContext -> {
                        var coffee = new Coffee();
                        coffee.setName("Cappuccino sexy coffee");
                        return coffee;
                    }
            ));
        }
    }
}

package com.ayush.example6.config;

import com.ayush.example6.beans.Bike;
import com.ayush.example6.beans.Car;
import com.ayush.example6.beans.Engine;
import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.core.env.Environment;

public class MyBeanRegistrar implements BeanRegistrar {
    @Override
    public void register(BeanRegistry registry, Environment env) {
        // generate the beans based on a condition
        int n= 1;

        // even: generate v12 and lambo
        if (n % 2 == 0) {

            registry.registerBean("engine", Engine.class, engineSpec -> engineSpec.supplier(
                    ctx -> {
                        var e= new Engine();
                        e.setName("V12 Engine");
                        return e;
                    }
            ));

            registry.registerBean("car", Car.class, carSpec -> carSpec.supplier(
                    ctx -> {
                        var c= new Car(ctx.bean(Engine.class));
                        c.setName("Lamborghini Ruvelto");
                        return c;
                    }
            ));

        }

        // odd: generate v8 and zx10r
        else {
            registry.registerBean("engine", Engine.class, engineSpec -> engineSpec.supplier(
                    ctx -> {
                        var e= new Engine();
                        e.setName("V8 Engine");
                        return e;
                    }
            ));

            registry.registerBean("bike", Bike.class, bikeSpec -> bikeSpec.supplier(
                    ctx -> {
                        var b= new Bike(ctx.bean(Engine.class));
                        b.setName("Ninja ZX10R");
                        return b;
                    }
            ));
        }
    }
}

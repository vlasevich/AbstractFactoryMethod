package com.home.vlas.abstractfactorymethod.Japan;


import com.home.vlas.abstractfactorymethod.Abstract.Car;
import com.home.vlas.abstractfactorymethod.Abstract.CarCreator;

public class JapanCarCreator extends CarCreator {

    public static final String INFINITI = "Infiniti";
    public static final String TOYOTA = "Toyota";
    public static final String MAZDA = "Mazda";

    @Override
    public Car create(String name) {

        switch (name) {
            case INFINITI: {
                return new Infiniti();
            }
            case TOYOTA: {
                return new Toyota();
            }
            case MAZDA: {
                return new Mazda();
            }
            default: {
                return null;
            }
        }

    }
}

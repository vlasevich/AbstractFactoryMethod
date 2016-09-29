package com.home.vlas.abstractfactorymethod.Japan;

import com.home.vlas.abstractfactorymethod.Abstract.Car;

public class Infiniti extends Car {
    @Override
    public String getInfo() {
        return "Car " + JapanCarCreator.INFINITI;
    }
}

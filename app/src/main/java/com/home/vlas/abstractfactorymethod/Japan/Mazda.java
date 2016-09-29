package com.home.vlas.abstractfactorymethod.Japan;

import com.home.vlas.abstractfactorymethod.Abstract.Car;

public class Mazda extends Car implements Cloneable {
    @Override
    public String getInfo() {
        return "Car " + JapanCarCreator.MAZDA;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

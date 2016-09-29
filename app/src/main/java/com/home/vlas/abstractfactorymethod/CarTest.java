package com.home.vlas.abstractfactorymethod;


public class CarTest {
    private String name;
    private int id;
    private boolean isSportCar;

    public CarTest(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.isSportCar = builder.isSportCar;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isSportCar() {
        return isSportCar;
    }

    protected static class Builder {
        private String name;
        private int id;
        private boolean isSportCar;

        protected Builder name(String name) {
            this.name = name;
            return this;
        }

        protected Builder id(int id) {
            this.id = id;
            return this;
        }

        protected Builder sportCar(boolean sportCar) {
            this.isSportCar = sportCar;
            return this;
        }

        protected CarTest build() {
            return new CarTest(this);
        }
    }
}

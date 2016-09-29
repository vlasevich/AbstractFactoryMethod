package com.home.vlas.abstractfactorymethod;


public class Ship {
    private int id;
    private String name;
    private boolean battleShip;


    public Ship(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.battleShip = builder.battleShip;
    }

    public boolean isBattleShip() {
        return battleShip;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    protected static class Builder {
        private int id;
        private String name;
        private boolean battleShip;

        protected Builder id(int id) {
            this.id = id;
            return this;
        }

        protected Builder name(String name) {
            this.name = name;
            return this;
        }

        protected Builder battleShip(boolean battleShip) {
            this.battleShip = battleShip;
            return this;
        }

        protected Ship build() {
            return new Ship(this);
        }
    }
}

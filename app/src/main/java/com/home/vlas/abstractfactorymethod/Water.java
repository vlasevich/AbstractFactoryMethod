package com.home.vlas.abstractfactorymethod;


public class Water {
    private String name;
    private boolean sugar;
    private boolean sodium;

    public Water(ColaBuilder colaBuilder) {
        this.name = colaBuilder.name;
        this.sugar = colaBuilder.sugar;
        this.sodium = colaBuilder.sodium;
    }

    public String getName() {
        return name;
    }

    public boolean isSodium() {
        return sodium;
    }

    public boolean isSugar() {
        return sugar;
    }

    public static class ColaBuilder {

        private String name;
        private boolean sugar;
        private boolean sodium;

        public ColaBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ColaBuilder sugar(boolean sugar) {
            this.sugar = sugar;
            return this;
        }

        public ColaBuilder sodium(boolean sodium) {
            this.sodium = sodium;
            return this;
        }

        public Water build() {
            return new Water(this);
        }
    }
}

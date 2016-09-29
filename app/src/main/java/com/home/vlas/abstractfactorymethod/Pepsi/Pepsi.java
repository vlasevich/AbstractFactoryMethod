package com.home.vlas.abstractfactorymethod.Pepsi;


import com.home.vlas.abstractfactorymethod.Abstract.AbstractFactory;
import com.home.vlas.abstractfactorymethod.Abstract.AbstractProductContainer;
import com.home.vlas.abstractfactorymethod.Abstract.AbstractProductLiquid;

public class Pepsi extends AbstractFactory {
    @Override
    public AbstractProductLiquid createLiquid() {
        return new PepsiLiquid();
    }

    @Override
    public AbstractProductContainer createContainer() {
        return new PepsiContainer();
    }
}

package com.home.vlas.abstractfactorymethod.Cola;


import com.home.vlas.abstractfactorymethod.Abstract.AbstractFactory;
import com.home.vlas.abstractfactorymethod.Abstract.AbstractProductContainer;
import com.home.vlas.abstractfactorymethod.Abstract.AbstractProductLiquid;

public class Cola extends AbstractFactory {
    @Override
    public AbstractProductLiquid createLiquid() {
        return new ColaLiquid();
    }

    @Override
    public AbstractProductContainer createContainer() {
        return new ColaContainer();
    }
}

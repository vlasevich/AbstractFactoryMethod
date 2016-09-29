package com.home.vlas.abstractfactorymethod;


import android.app.Activity;
import android.content.Context;

import com.home.vlas.abstractfactorymethod.Abstract.AbstractFactory;
import com.home.vlas.abstractfactorymethod.Abstract.AbstractProductContainer;
import com.home.vlas.abstractfactorymethod.Abstract.AbstractProductLiquid;

public class Worker {
    private AbstractProductLiquid liquid;
    private AbstractProductContainer container;

    public Worker(AbstractProductContainer container, AbstractProductLiquid liquid) {
        this.container = container;
        this.liquid = liquid;
    }


    public Worker(AbstractFactory factory) {
        liquid=factory.createLiquid();
        container=factory.createContainer();
    }

    public void run(){
        container.pour(liquid);
    }
}

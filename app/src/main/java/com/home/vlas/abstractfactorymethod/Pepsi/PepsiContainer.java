package com.home.vlas.abstractfactorymethod.Pepsi;


import com.home.vlas.abstractfactorymethod.Abstract.AbstractProductContainer;
import com.home.vlas.abstractfactorymethod.Abstract.AbstractProductLiquid;

public class PepsiContainer extends AbstractProductContainer {
    @Override
    public void pour(AbstractProductLiquid liquid) {
        System.out.println("liquid "+getClass().getSimpleName().replace("Container","")+" is poured");
    }
}

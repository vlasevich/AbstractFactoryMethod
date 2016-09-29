package com.home.vlas.abstractfactorymethod.Cola;


import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import com.home.vlas.abstractfactorymethod.Abstract.AbstractProductContainer;
import com.home.vlas.abstractfactorymethod.Abstract.AbstractProductLiquid;

public class ColaContainer extends AbstractProductContainer {
    @Override
    public void pour(AbstractProductLiquid liquid) {
        System.out.println("liquid "+getClass().getSimpleName().replace("Container","")+" is poured");
    }

}

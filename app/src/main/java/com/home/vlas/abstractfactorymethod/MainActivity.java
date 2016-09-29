package com.home.vlas.abstractfactorymethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.home.vlas.abstractfactorymethod.Cola.Cola;
import com.home.vlas.abstractfactorymethod.Pepsi.Pepsi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Worker worker1=new Worker(new Cola());
        Worker worker2=new Worker(new Pepsi());

        worker1.run();
        worker2.run();
    }
}

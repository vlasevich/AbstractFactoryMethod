package com.home.vlas.abstractfactorymethod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.home.vlas.abstractfactorymethod.Abstract.Car;
import com.home.vlas.abstractfactorymethod.Abstract.CarCreator;
import com.home.vlas.abstractfactorymethod.Cola.Cola;
import com.home.vlas.abstractfactorymethod.Japan.JapanCarCreator;
import com.home.vlas.abstractfactorymethod.Japan.Mazda;
import com.home.vlas.abstractfactorymethod.Pepsi.Pepsi;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Worker worker1=new Worker(new Cola());
        Worker worker2=new Worker(new Pepsi());

        worker1.run();
        worker2.run();

        Water cola = new Water.ColaBuilder()
                .name("Cola")
                .sugar(true)
                .sodium(true)
                .build();

        CarTest car1 = new CarTest.Builder()
                .name("Rocket")
                .id(111)
                .sportCar(true)
                .build();


        CarTest car2 = new CarTest.Builder()
                .id(222)
                .sportCar(false)
                .build();

        System.out.println(car1.getId() + " " + car1.getName() + " " + car1.isSportCar());

        if (car2.getName() == null) {
            Toast.makeText(this, "NO NAME", Toast.LENGTH_SHORT).show();
        }

        Ship ship = new Ship.Builder()
                .id(333)
                .name("WarShip")
                .battleShip(true)
                .build();

        System.out.println(ship.getName());

        CarCreator japanCarCreator = new JapanCarCreator();
        Car infiniti = japanCarCreator.create(JapanCarCreator.INFINITI);
        Car toyota = japanCarCreator.create(JapanCarCreator.TOYOTA);
        Car mazda = japanCarCreator.create(JapanCarCreator.MAZDA);

        Log.v(TAG, infiniti.getInfo());
        Log.v(TAG, toyota.getInfo());
        Log.v(TAG, mazda.getInfo());

        Mazda mazda1 = new Mazda();

        for (int i = 0; i < 10; i++) {
            try {
                Mazda mazda2 = (Mazda) mazda1.clone();
                Log.v(TAG, mazda2.getInfo());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

    }
}

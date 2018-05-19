package com.example.deepaksachdeva.dagger2sample;

import android.app.Application;

public class MyApplication extends Application {
    private IMyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = createMyComponent();
    }

    IMyComponent getMyComponent() {
        return myComponent;
    }

    private IMyComponent createMyComponent() {
        return DaggerIMyComponent
                .builder()
                .myModule(new MyModule())
                .build();
    }
}

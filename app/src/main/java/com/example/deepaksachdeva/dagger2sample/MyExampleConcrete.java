package com.example.deepaksachdeva.dagger2sample;

import java.util.Date;

public class MyExampleConcrete implements IMyExample {

    private long mDate;

    MyExampleConcrete() {
        mDate = new Date().getTime();
    }

    @Override
    public long getDate() {
        return mDate;
    }
}

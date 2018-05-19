package com.example.deepaksachdeva.dagger2sample;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyModule.class)
public interface IMyComponent {
    //A Component is a mapping between one or more modules and one or more classes that will use them

    void inject(MainActivity mainActivity);

}

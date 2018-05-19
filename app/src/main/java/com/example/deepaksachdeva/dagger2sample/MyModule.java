package com.example.deepaksachdeva.dagger2sample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {
//A Module defines one or more injectable classes (as denoted by the Provides annotation)

    @Provides
    @Singleton
    static MyExampleConcrete getMyExampleObj() {
        return new MyExampleConcrete();
    }
}

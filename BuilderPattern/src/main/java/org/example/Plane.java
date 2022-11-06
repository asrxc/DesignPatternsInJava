package org.example;

public abstract class Plane {
    public abstract void buildWings();
    public abstract void buildEngine();
    public abstract void buildTires();

    public void buildBathrooms(){
    }

    public abstract Aircraft getAircraft();
}

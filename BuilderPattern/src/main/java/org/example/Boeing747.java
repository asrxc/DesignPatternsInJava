package org.example;

public class Boeing747 extends Plane{
    public void buildWings() {
        System.out.println("Building wings");
    }
    public void buildEngine(){
        System.out.println("Building engines");
    }
    public void buildTires(){
        System.out.println("Building tyres");
    }

    public void buildBathrooms(){
        System.out.println("Building tyres");
    }

    public Aircraft getAircraft() {
        return Aircraft.Boeing747;
    }
}

package org.example;

public class F16 implements IAircraftType{
    F16 f16;

    public String getCode(){
        return "7";
    }
    public void fly() {
        System.out.println("F16 is flying!");
    }

    public void setEngine(F16 f16) {
       this.f16 = new F16();
    }

    public IAircraftType getClone() {
        return this.f16;
    }
}

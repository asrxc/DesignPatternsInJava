package org.example;

public class FlySafe {
    public static void main(String[] args) {
        IAircraftType f16A = new F16();
        f16A.setEngine(new F16());
        f16A.fly();

        IAircraftType f16B = f16A.getClone();
        f16B.fly();
    }
}
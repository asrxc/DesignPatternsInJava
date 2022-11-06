package org.example;

public interface IAircraftType {

    String getCode();
    void fly();
    void setEngine(F16 f16);
    IAircraftType getClone();
}

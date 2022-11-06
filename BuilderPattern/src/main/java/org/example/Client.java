package org.example;

public class Client {
    public static void main(String[] args) {
        PlaneBuilder planeBuilder = PlaneBuilder.getInstance();
        planeBuilder.buildPlane(new F16());
        planeBuilder.buildPlane(new Boeing747());
    }
}
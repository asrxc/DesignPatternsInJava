package org.example;

public class PlaneBuilder {

    static PlaneBuilder planeBuilder;

    private PlaneBuilder(){}

    public static PlaneBuilder getInstance(){
        if (planeBuilder == null){
            return planeBuilder = new PlaneBuilder();
        }
        return planeBuilder;
    }

    public void buildPlane(Plane plane){
        plane.buildTires();
        plane.buildEngine();
        plane.buildWings();
        if( plane.getAircraft() == Aircraft.Boeing747){
            plane.buildBathrooms();
        }
        System.out.println(plane.getAircraft()+" build successfully!");
    }

}

package org.example;

public class AirIndiaOne {
    private static volatile AirIndiaOne airIndiaOne;

    private AirIndiaOne(){}

    public synchronized static AirIndiaOne getInstance() {
        if(airIndiaOne == null){
            synchronized (AirIndiaOne.class) {
                airIndiaOne = new AirIndiaOne();
            }
        }
        return airIndiaOne;
    }

    public void fly(){
        System.out.println("AirIndiaOne is flying !");
    }
}

package org.example;

public class F16 {
    String version;

    public void buildF16(){
        buildVersion();
        buildEngine();
        buildWings();
        fly();
    }

    protected void buildVersion() {
        this.version="";
    }

    private void fly() {
        System.out.println("F16"+version+" is flying!");
    }

    private void buildWings() {
        System.out.println("F16"+version+" wings built");
    }

    private void buildEngine() {
        System.out.println("F16"+version+" engines built");
    }

}

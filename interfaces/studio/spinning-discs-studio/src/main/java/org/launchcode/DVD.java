package org.launchcode;

public class DVD extends OpticalDisc{
    // TODO: Implement your custom interface
    public final int spinRate = 700;

    @Override
    public void write() {
        System.out.println("you have written data to the DVD");
    }

    public DVD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}

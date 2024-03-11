package org.launchcode;

public class CD  extends OpticalDisc{
    public final int spinRate = 300;
    public CD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }
    @Override
    public void write() {
        System.out.println("you have written data to the CD");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}

package org.launchcode;

public abstract class OpticalDisc implements Disc{

    protected String name;
    protected double capacity;
    protected String contents;
    protected String discType;

    public OpticalDisc(String name, double capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }
    @Override
    public void spin(){
        System.out.println("Disc spinning.");
    }
    @Override
    public void read(){
        System.out.println(this.contents);
    }
    @Override
    public void write(String data){
        this.contents = data;
    };
    @Override
    public void eject(){
        System.out.println("Disc ejected");
    }
    @Override
    public void startPlaying(){
        System.out.println("Disc playing");
    }
    @Override
    public void stopPlaying(){
        System.out.println("Disc stopped");
    }
    @Override
    public void reportContents(){
        System.out.println(String.format("name:%s capacity:%s contents:%s discType:%s", this.name, this.capacity, this.contents, this.discType));;
    };
}

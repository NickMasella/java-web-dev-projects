package org.launchcode;

public interface Disc {
    void spin();
    void read();
    void write();

    void write(String data);

    void eject();
    void startPlaying();
    void stopPlaying();

    void reportContents();
}

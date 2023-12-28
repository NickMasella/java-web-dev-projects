public class Computer {

    public String operatingSystem;
    public boolean isPluggedIn;

    public boolean isOn;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    private void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isPluggedIn() {
        return isPluggedIn;
    }

    public void setPluggedIn(boolean pluggedIn) {
        isPluggedIn = pluggedIn;
    }

    public void turnOn() {
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }

    public Computer(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}

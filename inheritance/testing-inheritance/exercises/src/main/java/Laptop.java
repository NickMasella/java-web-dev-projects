public class Laptop extends Computer{

    public int USBPorts;

    public int getUSBPorts() {
        return USBPorts;
    }

    public void setUSBPorts(int USBPorts) {
        this.USBPorts = USBPorts;
    }


    public Laptop(String operatingSystem, int USBPorts) {
        super(operatingSystem);
        this.USBPorts = USBPorts;
    }
}

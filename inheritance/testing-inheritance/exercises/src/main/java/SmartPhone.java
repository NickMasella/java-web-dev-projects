public class SmartPhone extends Computer{
    public int SIMCardId;

    public int getSIMCardId() {
        return SIMCardId;
    }

    public void setSIMCardId(int SIMCardId) {
        this.SIMCardId = SIMCardId;
    }

    public SmartPhone(String operatingSystem, int SIMCardId) {
        super(operatingSystem);
        this.SIMCardId = SIMCardId;
    }
}

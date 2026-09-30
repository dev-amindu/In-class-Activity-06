package robots;

public class EntertainmentRobot extends Robot {
    private String entertainmentFeature;

    public EntertainmentRobot(String modelName, int batteryCapacity, String softwareVersion, String entertainmentFeature) {
        super(modelName, batteryCapacity, softwareVersion);
        this.entertainmentFeature = entertainmentFeature;
    }

    public String getEntertainmentFeature() {
        return entertainmentFeature;
    }

    public void setEntertainmentFeature(String entertainmentFeature) {
        this.entertainmentFeature = entertainmentFeature;
    }

    @Override
    public void performTask() {
        System.out.println("Entertainment Robot is demonstrating: " + entertainmentFeature);
    }

    @Override
    public String toString() {
        return "EntertainmentRobot [Model=" + getModelName() + ", Battery=" + getBatteryCapacity() + "h, Software=" + getSoftwareVersion() + ", Feature=" + entertainmentFeature + "]";
    }
}

package robots;

public abstract class Robot implements Cloneable {
    private String modelName;
    private int batteryCapacity; // in hours
    private String softwareVersion;

    public Robot(String modelName, int batteryCapacity, String softwareVersion) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;
        this.softwareVersion = softwareVersion;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public Robot clone() {
        try {
            return (Robot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported for " + this.getClass().getName());
        }
    }

    public abstract void performTask();
    
    @Override
    public String toString() {
        return "Robot [Model=" + modelName + ", Battery=" + batteryCapacity + "h, Software=" + softwareVersion + "]";
    }
}

package robots;

public class IndustrialRobot extends Robot {
    private String industrialTask;

    public IndustrialRobot(String modelName, int batteryCapacity, String softwareVersion, String industrialTask) {
        super(modelName, batteryCapacity, softwareVersion);
        this.industrialTask = industrialTask;
    }

    public String getIndustrialTask() {
        return industrialTask;
    }

    public void setIndustrialTask(String industrialTask) {
        this.industrialTask = industrialTask;
    }

    @Override
    public void performTask() {
        System.out.println("Industrial Robot is performing: " + industrialTask);
    }

    @Override
    public String toString() {
        return "IndustrialRobot [Model=" + getModelName() + ", Battery=" + getBatteryCapacity() + "h, Software=" + getSoftwareVersion() + ", Task=" + industrialTask + "]";
    }
}

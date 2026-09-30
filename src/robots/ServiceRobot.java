package robots;

public class ServiceRobot extends Robot {
    private String serviceTask;

    public ServiceRobot(String modelName, int batteryCapacity, String softwareVersion, String serviceTask) {
        super(modelName, batteryCapacity, softwareVersion);
        this.serviceTask = serviceTask;
    }

    public String getServiceTask() {
        return serviceTask;
    }

    public void setServiceTask(String serviceTask) {
        this.serviceTask = serviceTask;
    }

    @Override
    public void performTask() {
        System.out.println("Service Robot is performing: " + serviceTask);
    }

    @Override
    public String toString() {
        return "ServiceRobot [Model=" + getModelName() + ", Battery=" + getBatteryCapacity() + "h, Software=" + getSoftwareVersion() + ", Task=" + serviceTask + "]";
    }
}

import factory.RobotFactory;
import robots.Robot;
import robots.ServiceRobot;
import robots.IndustrialRobot;
import robots.EntertainmentRobot;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Robot Factory System (Prototype Pattern) ---");
        
        RobotFactory factory = new RobotFactory();

        // 1. Clone an existing Service Robot and customize it
        System.out.println("\nOrdering a custom Service Robot...");
        Robot serviceClone = factory.getClone("Service");
        if (serviceClone instanceof ServiceRobot) {
            ServiceRobot myServiceRobot = (ServiceRobot) serviceClone;
            // Customizing the cloned robot
            myServiceRobot.setBatteryCapacity(16);
            myServiceRobot.setSoftwareVersion("v1.2");
            myServiceRobot.setServiceTask("Healthcare Assistance");
            
            System.out.println("Original Prototype: " + factory.getClone("Service"));
            System.out.println("Customized Clone:   " + myServiceRobot);
            myServiceRobot.performTask();
        }

        // 2. Clone an existing Industrial Robot and customize it
        System.out.println("\nOrdering a custom Industrial Robot...");
        Robot industrialClone = factory.getClone("Industrial");
        if (industrialClone instanceof IndustrialRobot) {
            IndustrialRobot myIndustrialRobot = (IndustrialRobot) industrialClone;
            // Customizing the cloned robot
            myIndustrialRobot.setSoftwareVersion("v2.1 (Security Patch)");
            myIndustrialRobot.setIndustrialTask("Car Assembly");
            
            System.out.println("Original Prototype: " + factory.getClone("Industrial"));
            System.out.println("Customized Clone:   " + myIndustrialRobot);
            myIndustrialRobot.performTask();
        }
        
        // 3. Clone an existing Entertainment Robot
        System.out.println("\nOrdering a standard Entertainment Robot...");
        Robot entertainmentClone = factory.getClone("Entertainment");
        System.out.println("Standard Clone:     " + entertainmentClone);
        if (entertainmentClone != null) {
            entertainmentClone.performTask();
        }
    }
}

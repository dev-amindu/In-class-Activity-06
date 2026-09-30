package factory;

import robots.Robot;
import robots.ServiceRobot;
import robots.IndustrialRobot;
import robots.EntertainmentRobot;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private Map<String, Robot> prototypes = new HashMap<>();

    public RobotFactory() {
        // Initialize with default prototypes
        prototypes.put("Service", new ServiceRobot("S-100", 12, "v1.0", "General Assistance"));
        prototypes.put("Industrial", new IndustrialRobot("I-500", 24, "v2.0", "Welding"));
        prototypes.put("Entertainment", new EntertainmentRobot("E-300", 8, "v1.5", "Dancing"));
    }

    public void addPrototype(String key, Robot robot) {
        prototypes.put(key, robot);
    }

    public Robot getClone(String key) {
        Robot prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }
}

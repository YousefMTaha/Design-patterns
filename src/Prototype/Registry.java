package Prototype;

import java.util.HashMap;

public class Registry {

    HashMap<String, Device> devices;

    public Registry() {
        devices = new HashMap<>();
        initialize();
    }

    void initialize() {
        devices.put("laptop", new Laptop("s", "\"s\"", "\"s\"", "\"s\"", 123, 1, "eee"));
        devices.put("tablet", new Tablet("t", "\"t\"", "\"t\"", "\"t\"", 123, 1));
    }

    public Device getClone(String objNames) {
        Object clone = null;
        try {
            clone = devices.get(objNames).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return (Device) clone;
    }

}

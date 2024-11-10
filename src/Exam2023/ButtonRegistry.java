package Exam2023;

import java.util.HashMap;

public class ButtonRegistry {
    public vechile getVec(String name) {
        switch (name) {
            case "car":
                return new car();
            case "bus":
                return new bus();
            case "truck":
                return new truck();
            default:
                return null;
        }
    }
}

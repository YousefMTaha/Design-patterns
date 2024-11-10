package Prototype;

public class Tablet extends Device {
    public Tablet(String manufacturer, String screenSize, String operatingSystem, String capacity, float price, int quantity) {
        super(manufacturer, screenSize, operatingSystem, capacity, price, quantity);
    }

    @Override()
    public Object clone() throws CloneNotSupportedException {
        return  super.clone();
    }
}

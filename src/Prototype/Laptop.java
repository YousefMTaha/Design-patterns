package Prototype;

public class Laptop extends Device {
    private String keyboardType;

    public Laptop(String manufacturer, String screenSize, String operatingSystem, String capacity, float price, int quantity, String keyboardType) {
        super(manufacturer, screenSize, operatingSystem, capacity, price, quantity);
        this.keyboardType = keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    public Object clone() {
        try {

            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

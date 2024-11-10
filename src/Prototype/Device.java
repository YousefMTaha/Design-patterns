package Prototype;

public abstract class Device implements Cloneable {
    private String manufacturer;
    private String screenSize;
    private String operatingSystem;
    private String capacity;
    private float price;
    int quantity;

    public Device(String manufacturer, String screenSize, String operatingSystem, String capacity, float price, int quantity) {
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.capacity = capacity;
        this.price = price;
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void display() {
        System.out.println(this.price);
        System.out.println(this.operatingSystem);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

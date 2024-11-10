package Exam2023;

public class button implements Cloneable {
    String id;
    int x;
    int y;
    String color;

    public String getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

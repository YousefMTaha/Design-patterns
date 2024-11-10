package Decorator;

public abstract class ShapeDecortator implements Shape {

    protected Shape shape;

    public ShapeDecortator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        this.shape.draw();
    }

}

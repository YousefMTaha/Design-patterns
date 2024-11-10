package Decorator;

public class RedShapeDecorator extends ShapeDecortator {


    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("this from red border");
    }
}

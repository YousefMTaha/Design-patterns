package Factory;

public class ShapeFactory {


    public Shape getShape(String name) {
        switch (name) {
            case "Circle":
            case "circle":
                return new Circle();
            case "Rectangle":
            case "rectangle":
                return new Rechtangle();
            case "Square":
            case "square":
                return new Square();
            default:
                return null;
        }


    }
}

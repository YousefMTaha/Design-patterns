import Decorator.Circle;
import Decorator.RedShapeDecorator;
import Exam2023.ButtonRegistry;
import Exam2023.car;
import Prototype.Laptop;
import Prototype.Registry;
import Prototype.Tablet;
import Proxy.RealDownload;
import Exam2023.vechile;

public class Main {
    public static void main(String[] args) {

        Registry r = new Registry();

        Laptop l = (Laptop) r.getClone("laptop");
        l.display();

        Tablet t = (Tablet) r.getClone("tablet");
        t.display();

    }
}
package singletone;

public class singleObject {

    static singleObject so;

    private singleObject() {

    }

    static public singleObject getInstance() {
        if (so == null) {
            so = new singleObject();
        }
        return so;
    }

    public void showMessage() {
        System.out.println("message");
    }

}

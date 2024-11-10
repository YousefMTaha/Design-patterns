package Builder2.Builder;

public class XMLDocBuilder extends DocBuilder {

    private XMlDoc xd;

    @Override
    public void createDocument() {
        this.xd = new XMlDoc();
    }

    @Override
    public void createText() {
        System.out.println("create text for xml");
    }

    @Override
    public void createImages() {

        System.out.println("Create images for xml");

    }

    @Override
    public Document getDocument() {
        return this.xd;
    }
}

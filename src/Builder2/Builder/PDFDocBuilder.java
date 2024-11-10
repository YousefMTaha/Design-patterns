package Builder2.Builder;

public class PDFDocBuilder extends DocBuilder {

    private PDFDoc pd;

    @Override()
    public void createDocument() {
        this.pd = new PDFDoc();
    }

    @Override()
    public void createText() {
        System.out.println("create text for pdf");
    }

    @Override()
    public void createImages() {
        System.out.println("create images for pdf");
    }

    @Override()
    public Document getDocument() {
        return this.pd;
    }


}

package Proxy;

public class ProxyDownload implements Download {

    private RealDownload rd;
    private String targetFile;

    public ProxyDownload(String targetFile) {
            this.rd = new RealDownload(targetFile);
    }
    @Override
    public void download() {
        rd.download();
    }

}

package Proxy;

public class RealDownload implements Download {
    private String targetFile;
    private String targetData;

    public RealDownload(String targetFile) {
            this.targetFile = targetFile;
    }

    private void downloadFromInternet(){
        System.out.println("downloadFromInternet: " + targetFile);
    }

    @Override
    public void download() {
        downloadFromInternet();
    }
}

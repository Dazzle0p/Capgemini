package capgemini;

class Downloader extends Thread{
    private String image;

    Downloader(String image){
        this.image = image;
    }

    @Override
    public void run(){
        System.out.println("Downloading Started " + image + "Using thread" + Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            System.out.println("Downloading Interrupted for Image" + image);
        }
        System.out.println("Downloading finished " + image);
    }
}

public class ImageDownloader {
    public static void main(String[] args) {
        String images[] = {"Image1", "Image2", "Image3"};
        for(int i=0; i<images.length; i++){
            Downloader d = new Downloader(images[i]);
            d.start();
        }
    }
}

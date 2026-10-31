class DownloadThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Downloading file .....");
        for (int i = 1; i <= 5; i++) {
            System.out.println("downloaded " + i + " MB");
        }
        System.out.println("download completed.");
    }
}
public class thread1 {
    public static void main(String args[]) {
        DownloadThread t1 = new DownloadThread();
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
package multithreading;

public class MultiThreading2 extends Thread {

    @Override
    public void run() {
        String result = Thread.currentThread().getName();
        for (int i = 0; i<=3; i++) {
        System.out.println("Multithreading..." + result);
//        Thread.yield();
        }
    }
}

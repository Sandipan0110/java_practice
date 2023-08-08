package multithreading;

/** MultiThreading Extends with Runnable.
 * --------------------------------------
 * */

public class MultiThreading1 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Multithreading...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException x) {
            throw new RuntimeException(x);
        }
    }
}

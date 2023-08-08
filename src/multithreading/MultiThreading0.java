package multithreading;

/** MultiThreading Extends with Thread.
 * ------------------------------------
 * */
class MultiThreading0 extends Thread {

    @Override
    public void run() {
//        try {
//            String result = Thread.currentThread().getName();
//            for (int i = 0; i <= 2; i++) {
//                System.out.println("Multithreading..." + result);
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException x) {
//            throw new RuntimeException(x);
//        }
/**
 * * ---------------------------------------------------------------------------------------------------------------------
 */
//        String result = Thread.currentThread().getName();
//        for (int i = 0; i <= 3; i++) {
//            System.out.println("Multithreading..." + result);
//            Thread.yield();
//        }
/**
 * * ---------------------------------------------------------------------------------------------------------------------
 */
//        System.out.println("Checking Thread is Alive or Not...");
/**
 * * ---------------------------------------------------------------------------------------------------------------------
 */
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
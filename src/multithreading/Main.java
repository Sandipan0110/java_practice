package multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /** MultiThreading Implements with Runnable.
         * -----------------------------------------
         * New Born State --> Ready State --> Block State <-- Running State --> Dead State
         * New Born State : Creatng New Object.
         * Ready State : Start Executig the Code with thread.start();
         * Block State : If any Methods will call then Thread will go Block State
         *               thread.join();
         *               thread.wait();
         *               thread.stop();
         *
         *               thread.suspend();
         *               thread.resume();
         * Running State : Executing the Code and if any Block State Methids Call the it will go Block state and
         *                 Again it will go Ready state will call thread.run(); Method to Running State.
         * Dead State : Code will stop with thread.stop(); Method.
         */

        MultiThreading1 multiThreading1 = new MultiThreading1();
        Thread thread = new Thread(multiThreading1);
        thread.start();

        thread.join();
        thread.wait();
        thread.stop();

        thread.suspend();
        thread.resume();
/**
 * ---------------------------------------------------------------------------------------------------------------------
 */
        /** MultiThreading Extends with Thread.
         * ------------------------------------
         * */
        MultiThreading0 multiThreading0 = new MultiThreading0();
        MultiThreading0 multiThreading00 = new MultiThreading0();
        MultiThreading0 multiThreading000 = new MultiThreading0();

        multiThreading0.setName("MultiThreading0 Executing...");
        multiThreading00.setName("MultiThreading00 Executing...");
        multiThreading000.setName("MultiThreading000 Executing...");

        multiThreading0.start();

        multiThreading00.start();
        multiThreading00.suspend();

        multiThreading000.start();

        multiThreading00.resume();

/**
 * ---------------------------------------------------------------------------------------------------------------------
 */

        try {
            multiThreading00.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        multiThreading0.start();
        multiThreading00.start();
        multiThreading000.start();

        String result = Thread.currentThread().getName();

        for (int i = 0; i <= 2; i++) {
            System.out.println("Hello world ! " + result);
            Thread.sleep(1000);
        }
/**
 * ---------------------------------------------------------------------------------------------------------------------
 */
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello world !");
            Thread.sleep(1000);
        }
/**
 * ---------------------------------------------------------------------------------------------------------------------
 */
//        MultiThreading0 multiThreading0 = new MultiThreading0();
//        MultiThreading2 multiThreading2 = new MultiThreading2();
//
//        multiThreading0.start();
//        multiThreading2.start();
///**
// * ---------------------------------------------------------------------------------------------------------------------
// */
//        MultiThreading0 multiThreading0 = new MultiThreading0();
//        MultiThreading0 multiThreading00 = new MultiThreading0();
//
//        multiThreading0.setName("MultiThreading0 Executing...");
//        multiThreading00.setName("MultiThreading00 Executing...");
//
//        multiThreading00.stop();
//
//        System.out.println(multiThreading00.isAlive());
//
//        multiThreading0.start();
//        multiThreading00.start();
//
//        System.out.println(multiThreading00.isAlive());
//
//        if (multiThreading0.isAlive()) {
//            System.out.println("Thread 0 is Alive");
//            multiThreading0.start();
//        } else {
//            System.out.println("Thread 00 is Alive");
//            multiThreading00.start();
//        }

/**
 * ---------------------------------------------------------------------------------------------------------------------
// */
//        MultiThreading0 multiThreading0 = new MultiThreading0();
//        MultiThreading0 multiThreading00 = new MultiThreading0();
//
//        multiThreading0.setName("Start Thread 1...");
//        multiThreading00.setName("Start Thread 2...");
//
//        multiThreading0.start();
//        multiThreading00.start();
//
//        multiThreading0.setPriority(5);
//        multiThreading00.setPriority(9);

    }
}
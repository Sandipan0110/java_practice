package executerService_multithreading;

import java.util.concurrent.CountDownLatch;

class Dev extends Thread {
    private CountDownLatch countDownLatch;

     Dev(CountDownLatch countDownLatch, String name) {
        super(name);
        this.countDownLatch = countDownLatch;
    }

    @Override
    public synchronized void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("Dev Completed...");
        countDownLatch.countDown();
    }
}
class Qa extends Thread {
    private CountDownLatch countDownLatch;

     Qa(CountDownLatch countDownLatch, String name) {
        super(name);
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("Handover To QA...");
    }
}

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);

        Dev dev = new Dev(countDownLatch, "Thread-1");
        Dev dev1 = new Dev(countDownLatch, "Thread-2");
        dev.start();
        dev1.start();

        countDownLatch.await();

        Qa qa = new Qa(countDownLatch,"Thread-3");
        Qa qa1 = new Qa(countDownLatch,"Thread-4");
        qa.start();
        qa1.start();
    }
}

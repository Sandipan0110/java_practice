package executerService_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Task1...");
    }
}

public class ExecuterServiceExample1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Task2...");
            }
        };

        Runnable runnable1 = () -> System.out.println(Thread.currentThread().getName() + " Task3...");

        A a = new A();
        executorService.submit(a);
        executorService.submit(runnable);
        executorService.submit(runnable1);

        executorService.shutdown();
    }
}

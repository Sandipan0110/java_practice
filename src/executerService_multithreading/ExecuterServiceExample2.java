package executerService_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Xyz implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Task3...");
    }
}

class Abc extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Task4...");
    }
}

public class ExecuterServiceExample2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Task1...");
            }
        };

        Runnable runnable1 = () -> {
//            try {
//                TimeUnit.SECONDS.sleep(2);
                System.out.println(Thread.currentThread().getName()  + " Task2...");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        };

//        Xyz xyz = new Xyz();
//        Abc abc = new Abc();

        executorService.submit(runnable);
        executorService.submit(runnable1);
//        executorService.submit(xyz);
//        executorService.submit(abc);
        executorService.submit(new Xyz());
        executorService.submit(new Abc());

        executorService.shutdown();
    }
}

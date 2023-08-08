package executerService_multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class CallableExample implements Callable {

    int input;

    CallableExample(int input) {
        this.input = input;
    }

    @Override
    public Integer call() throws InterruptedException {
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum = i + input;
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Sum is : " + sum);
        }
        return sum;
    }
}

public class ExecuterServiceExample3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Using Lambda Function
        Callable<String> callable = () -> "Task1...";

        Callable<String> callable1 = new Callable<String>() {

            @Override
            public String call() throws Exception {
                String a = "Task2...";
                TimeUnit.SECONDS.sleep(1);
                return a;
            }
        };

        CallableExample callableExample = new CallableExample(2);

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(callable);
        Future<String> future1 = executorService.submit(callable1);
        Future<Integer> future2 = executorService.submit(new CallableExample(3));
        executorService.submit(callableExample);

        System.out.println(future.get());
        System.out.println(future1.get());
        System.out.println(future2.get());

        executorService.shutdown();
    }
}

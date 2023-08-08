package practice;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        // Create a ScheduledThreadPoolExecutor with a core pool size of 2
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(2);

        // Schedule a task to run after a delay of 1 second
        executor.schedule(new Task("Task 1"), 1, TimeUnit.SECONDS);

        // Schedule a task to run periodically every 2 seconds
        executor.scheduleAtFixedRate(new Task("Task 2"), 0, 2, TimeUnit.SECONDS);

        // Schedule a task to run after a fixed delay of 3 seconds
        executor.scheduleWithFixedDelay(new Task("Task 3"), 0, 3, TimeUnit.SECONDS);

        // Shutdown the executor after 10 seconds
        executor.schedule(() -> executor.shutdown(), 10, TimeUnit.SECONDS);
    }

    static class Task implements Runnable {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        public void run() {
            System.out.println("Executing " + name + " - Thread: " + Thread.currentThread().getName());
        }
    }
}

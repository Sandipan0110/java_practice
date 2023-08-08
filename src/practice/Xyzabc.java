package practice;


class Anna extends Thread {
//class Anna implements Runnable {
     public void run() {
         for (int i = 0; i <= 2; i++) {
             try {
                 sleep(1000);
                 System.out.println("Thread Name -> " + Thread.currentThread().getName() + ", Value -> " + i);

             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
     }
}

class Practice {
    public static void main(String[] args) throws InterruptedException {
        Anna anna1 = new Anna();
        Anna anna2 = new Anna();
//        Anna anna3 = new Anna();
        
//        Thread thread1 = new Thread(anna1, "anna1");
//        Thread thread2 = new Thread(anna2, "anna2");
////        Thread thread3 = new Thread("anna3");
//
//        thread1.start();
//        thread1.join(2000);
//        thread2.start();
//        thread2.join();
//        thread3.start();
//        thread3.join();

        anna1.start();
        System.out.println("1st");
        try {
            anna1.join(2000);
            System.out.println("1st");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        anna2.start();
        System.out.println("2nd");
        try {
            anna2.join();
            System.out.println("2nd");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        anna3.start();
//        try {
//            anna3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


    }
}


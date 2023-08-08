package multithreadingRealExample;

class Bank extends Thread {

    static int cash = 5000;
    static int balance;

    Bank(int balence) {
        this.balance = balence;
    }

    public static synchronized void money() {
        String name = Thread.currentThread().getName();
        if(cash>=balance) {
            System.out.println(name + " Withdrawn The Money Rs. : " + balance);
            cash=cash-balance;
        } else {
            System.out.println("Sorry ! " + name + " Insufficient Balance. Avalable Balance is : " + cash);
        }
    }

    @Override
    public void run() {
        money();
    }
}

public class Customer {
    public static void main(String[] args) {
        Bank b1 = new Bank(2000);

        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);
        Thread t3 = new Thread(b1);
        Thread t4 = new Thread(b1);

        t1.setName("Sandipan");
        t2.setName("Udhay");
        t3.setName("Kinkar");
        t4.setName("Supratick");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

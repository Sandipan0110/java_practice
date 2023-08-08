package multithreadingRealExample;

public class Bus implements Runnable {
    //Variable initialization
    int avalable = 1;
    int passenger;

    //Create Constructor For Set the Value of Passenger
    Bus(int passenger) {
        this.passenger = passenger;
    }

    /**
     * Non Synchronized -> Got Wrong Value
     **/

////  Override The Method
//    @Override
//    public void run() {
//        String name = Thread.currentThread().getName();
//        if (avalable>= passenger) {
//            System.out.println("Congratulation... " + name + " You Got The Seat.");
//            avalable = avalable - passenger;
//        } else {
//            System.out.println("Sorry ! " + Thread.currentThread().getName() + " Seat is Not Avalable For You.");
//        }
//    }

    /**
     * Synchronized -> Got Proper Value
     */

    //  Override The Method
    @Override
    public synchronized void run() {
        String name = Thread.currentThread().getName();
        if (avalable>= passenger) {
            System.out.println("Congratulation... " + name + " You Got The Seat.");
            avalable = avalable - passenger;
        } else {
            System.out.println("Sorry ! " + Thread.currentThread().getName() + " Seat is Not Avalable For You.");
        }
    }
}

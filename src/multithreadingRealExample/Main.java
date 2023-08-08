package multithreadingRealExample;

public class Main {
    //Main
    public static void main(String[] args) {

        //Creating New Bus Object With Passing Passenger
        Bus bus = new Bus(1);

        //Creating New Thread Object
        Thread t1 = new Thread(bus);
        Thread t2 = new Thread(bus);

        //Setting Name of The Passenger
        t1.setName("Udhay");
        t2.setName("Sandipan");

        //Start The Thread for Executing
        t1.start();
        t2.start();
    }
}

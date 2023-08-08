package oops.abstraction.interfaces;

import java.util.Scanner;

public interface Vehicle {
    void colour();
    void catagory();

}

abstract class VehicleImpl1 implements Vehicle {
    @Override
    public void catagory() {
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Vehicle Name is : " + name);
    }
}

class VehicleImpl extends VehicleImpl1 {
//class VehicleImpl implements Vehicle {
    @Override
    public void colour() {
        String name;
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Vehicle Colour is : " + name);
    }
//    @Override
//    public void catagory() {
//        String name;
//        Scanner scanner = new Scanner(System.in);
//        name = scanner.nextLine();
//        System.out.println("Vehicle Name is : " + name);
//    }
}

class Interface {
    public static void main(String[] args) {
        Vehicle vehicle = new VehicleImpl();
        System.out.println("Enter a Catagory of the vehicle : ");
        vehicle.catagory();
        System.out.println("Enter a Colour of the vehicle : ");
        vehicle.colour();
    }
}

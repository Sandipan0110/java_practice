package practice;

import java.util.Scanner;

import static practice.Constant.AXIS;
import static practice.Constant.BOB;
import static practice.Constant.BOI;
import static practice.Constant.SBI;
import static practice.Constant.UBI;

class BanksImpl implements Banks {
    @Override
    public void bankInterst() {
        String banksName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Bank Name : ");
        banksName = scanner.next();

        switch (banksName) {
            case SBI:
                System.out.println("Interst is : 5.1%");
                break;
            case UBI:
                System.out.println("Interst is : 5.2%");
                break;
            case BOB:
                System.out.println("Interst is : 5.3%");
                break;
            case AXIS:
                System.out.println("Interst is : 5.4%");
                break;
            case BOI:
                System.out.println("Interst is : 5.5%");
                break;
            default:
                System.out.println("InValid Bank Name ... Please Enter -> [ SBI or UBI or BOB or AXIS or BOI ]");
        }
    }
}


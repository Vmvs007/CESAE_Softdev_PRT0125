package Views;

import Controllers.AdminController;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AdminView {

    AdminController adminController;

    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    public void adminMenu() throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int menuOption;

        do {

            System.out.println("\nHello Dear Admin. Nice to See You \uD83D\uDC51");
            System.out.println("1. Most Sold Product (By Units)");
            System.out.println("2. Most Sold Product (By Value)");
            System.out.println("3. Best Sale (By Units)");
            System.out.println("4. Best Sale (By Value)");
            System.out.println("5. Total Sales");
            System.out.println("6. Average Sales");
            System.out.println("7. Coffee Time");
            System.out.println("0. Exit \uD83C\uDFC3\uD83D\uDEAA");
            System.out.print("Choose: ");

            menuOption = input.nextInt();

            switch (menuOption) {
                case 1: // Most Sold Product (By Units)
                    break;

                case 2: // Most Sold Product (By Value)
                    break;

                case 3: // Best Sale (By Units)
                    break;

                case 4: // Best Sale (By Value)
                    break;

                case 5: // Total Sales
                    double totalSales = this.adminController.getTotalSales();

                    System.out.println("********** \uD83D\uDCB0 Total Sales \uD83D\uDCB0 **********");
                    System.out.println(totalSales + " €");

                    break;

                case 6: // Average Sales
                    break;

                case 7: // Coffee Time
                    coffeeTime();
                    break;

                case 0: // Exit
                    break;

                default: // Invalid Option
                    System.out.println("\uD83D\uDEA8 Invalid Option \uD83D\uDEA8");
            }
        } while (menuOption != 0);
    }

    private void coffeeTime() throws InterruptedException {
        System.out.println("Awaiting Coffee");
        System.out.println("₊˚.\uD83C\uDFA7 ✩｡ \uD83E\uDD0E");
        System.out.println("_________________________");
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");
        sleep(300);
        System.out.print("|");

        System.out.println("\n\n☕");

    }
}

package Views;

import java.util.Scanner;

public class AdminView {

    public AdminView() {
    }

    public void adminMenu() {

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
                    break;

                case 6: // Average Sales
                    break;

                case 0: // Exit
                    break;

                default: // Invalid Option
                    System.out.println("\uD83D\uDEA8 Invalid Option \uD83D\uDEA8");
            }
        } while (menuOption != 0);
    }
}

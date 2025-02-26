package Views;

import java.util.Scanner;

public class CustomerView {

    public CustomerView() {
    }

    public void customerMenu() {

        Scanner input = new Scanner(System.in);
        int menuOption;

        do {
            System.out.println("\nHello! Nice to see you. \uD83D\uDED2");
            System.out.println("1. Available Products");
            System.out.println("2. Products by Category");
            System.out.println("3. Most Expensive/Cheapest Product");
            System.out.println("0. Exit \uD83C\uDFC3\uD83D\uDEAA");
            System.out.print("Choose: ");

            menuOption = input.nextInt();

            switch (menuOption) {
                case 1: // Available Products
                    break;

                case 2: // Products by Category
                    break;

                case 3: // Most Expensive/Cheapest Product
                    break;

                case 0: // Exit
                    break;

                default: // Invalid Option
                    System.out.println("\uD83D\uDEA8 Invalid Option \uD83D\uDEA8");
            }

        } while (menuOption != 0);
    }
}

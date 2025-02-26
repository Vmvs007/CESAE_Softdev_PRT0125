package Views;

import Controllers.CustomerController;
import Domain.Sale;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomerView {

    private CustomerController customerController;

    public CustomerView() throws FileNotFoundException {
        this.customerController = new CustomerController();
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
                    Sale expensive = this.customerController.mostExpensiveProduct();
                    Sale cheapest = this.customerController.cheapestProduct();

                    System.out.println("Most Expensive: " + expensive.getCategory() + " | " + expensive.getProduct() + " | " + expensive.getUnitPrice() + " €");
                    System.out.println("Cheapest: " + cheapest.getCategory() + " | " + cheapest.getProduct() + " | " + cheapest.getUnitPrice() + " €");
                    break;

                case 0: // Exit
                    break;

                default: // Invalid Option
                    System.out.println("\uD83D\uDEA8 Invalid Option \uD83D\uDEA8");
            }

        } while (menuOption != 0);
    }
}

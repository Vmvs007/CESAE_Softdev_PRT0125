package Views;

import java.util.Scanner;

public class LoginView {

    public LoginView() {
    }

    public void entryView() {

        Scanner input = new Scanner(System.in);
        int loginOption;

        do {
            System.out.println("\nWelcome to Big Business Grocery Store \uD83E\uDD1D");
            System.out.println("1. Customer");
            System.out.println("2. Staff Member");
            System.out.println("0. Exit \uD83C\uDFC3\uD83D\uDEAA");
            System.out.print("Choose: ");

            loginOption = input.nextInt();

            switch (loginOption) {
                case 1: // Customer
                    CustomerView customerView = new CustomerView();
                    customerView.customerMenu();
                    break;

                case 2: // Staff Member

                    System.out.println("\nLogin with your credentials");

                    System.out.print("Username: ");
                    String usernameInput = input.next();

                    System.out.print("Password: ");
                    String passwordInput = input.next();

                    break;

                case 0: // Exit
                    break;

                default: // Invalid Option
                    System.out.println("\uD83D\uDEA8 Invalid Option \uD83D\uDEA8");
            }
        } while (loginOption != 0);
    }


    private void validateLogin(String usernameInput, String passwordInput){

    }

}

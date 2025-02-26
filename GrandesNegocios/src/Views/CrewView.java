package Views;

import java.util.Scanner;

public class CrewView {

    public CrewView() {
    }

    public void crewMenu() {

        Scanner input = new Scanner(System.in);
        int menuOption;

        do {
            System.out.println("\nHello! Get to Work. \uD83D\uDEE0\uFE0F");
            System.out.println("1. Add New Sale");
            System.out.println("2. Check Product Stock");
            System.out.println("0. Exit \uD83C\uDFC3\uD83D\uDEAA");
            System.out.print("Choose: ");

            menuOption = input.nextInt();

            switch (menuOption) {
                case 1: // Add New Sale
                    break;

                case 2: // Check Product Stock
                    break;

                case 0: // Exit
                    break;


                default: // Invalid Option
                    System.out.println("\uD83D\uDEA8 Invalid Option \uD83D\uDEA8");
            }
        }while(menuOption!=0);
    }
}

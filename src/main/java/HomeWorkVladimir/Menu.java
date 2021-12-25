package HomeWorkVladimir;

import java.util.Scanner;

public class Menu {
    static void showMenu() {

        System.out.println(
                        "1.Add user\n" +
                        "2.Show all persons\n" +
                        "3.Delete person action\n" +
                        "4.Delete person\n" +
                        "5.Show person action\n" +
                        "6.Show all persons with actions\n"
        );
        try {
            showMenuChose(Integer.parseInt(userChoice()));
        } catch (NumberFormatException exception) {
            System.err.println("Incorrect input, please try again");
            showMenu();
        }
    }

    private static void showMenuChose(int chose) {
        switch (chose) {
            case 1:
                SystemPanel.addPerson();
                showMenu();
                break;
            case 2:
                SystemPanel.showPerson();
                showMenu();
                break;
            case 3:
                System.out.println("Enter person name and lastname:");
                try {
                    SystemPanel.deletePersonAction(userChoice());
                } catch (PersonNotFoundException e) {
                    System.err.println(e.getMessage());
                }
                showMenu();
                break;
            case 4:
                System.out.println("Enter person name and lastname:");
                try {
                    SystemPanel.deletePerson(userChoice());
                } catch (PersonNotFoundException e) {
                    System.err.println(e.getMessage());
                }
                showMenu();
                break;
            case 5:
                System.out.println("Enter person name and lastname:");
                try {
                    SystemPanel.showPersonAction(userChoice());
                } catch (PersonNotFoundException e) {
                    System.err.println(e.getMessage());
                }
                showMenu();
            case 6:
                SystemPanel.showAllPersonWithActions();
                showMenu();
                break;
            default:
        }
    }

    public static String userChoice() {
        Scanner scanner = new Scanner(System.in);
        String str = new String(scanner.nextLine());
        return str;
    }
}

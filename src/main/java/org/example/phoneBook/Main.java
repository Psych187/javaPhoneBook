package org.example.phoneBook;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        fillContacts(myPhoneBook);
        mainMenu(myPhoneBook);
    }

    public static void fillContacts(PhoneBook phoneBook) {
        phoneBook.add("Mine", "79253440987");
        phoneBook.add("Mine", "79464661746");
        phoneBook.add("Inna", "792533000987");
        phoneBook.add("Inna", "79251210987");
        phoneBook.add("Vika", "70003440987");
        phoneBook.add("Inna", "79092440987");
    }

    public static void mainMenu(PhoneBook phoneBook) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Remove number");
            System.out.println("4. Show");
            System.out.println("5. Exit");
            System.out.print("Enter menu punct: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter number: ");
                    String phone = scanner.nextLine();
                    phoneBook.add(name, phone);
                    break;
                case 2:
                    System.out.print("Enter name to remove: ");
                    String deleteName = scanner.nextLine();
                    phoneBook.deleteContact(deleteName);
                    break;
                case 3:
                    System.out.println("Enter name to remove number: ");
                    String removeName = scanner.nextLine();
                    System.out.println("Enter number: ");
                    String removeNumber = scanner.nextLine();
                    phoneBook.removeNumber(removeName, removeNumber);
                    break;
                case 4:
                    phoneBook.getAllContacts();
                    break;
                case 5:
                    System.out.println("See you");
                    System.exit(0);
                default:
                    System.out.println("Incorrect punct");
            }
        }
    }
}
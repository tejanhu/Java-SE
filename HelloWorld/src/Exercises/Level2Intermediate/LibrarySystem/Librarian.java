package Exercises.Level2Intermediate.LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Librarian implements Admin {

    private String name;
    final String jobTitle = "Librarian";

    public Librarian(String name, String jobTitle) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String searchItem(ArrayList<Item> items, String itemTitle) {

        String msg = "";
        Book myPreciousBook = new Book("The Hobbit", "J. R. R. Tolkien", "09/21/1937", 1230456, true, 5);
        Magazine someMag = new Magazine("Vogue", "Anna Wintour", "12/17/1892", 1230456, true, 1, "USA");
        Newspaper myNewspaper = new Newspaper("The Sun", "Sun Publishing Company", "10/6/2016", 1230456, 25, true, 1);
        items.add(myPreciousBook);
        items.add(someMag);
        items.add(myNewspaper);
        boolean isFound = false;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getTitle().equals(itemTitle)) {
                if (items.get(i).getQuantity() == 1) {
                    msg = items.get(i).getQuantity() + " copy of " + itemTitle + " Found";
                    System.out.println(msg);
                    isFound = true;
                    break;
                } else {
                    msg = items.get(i).getQuantity() + " copies of " + itemTitle + " Found";
                    System.out.println(msg);
                    isFound = true;
                    break;
                }
            }
        }
        if (isFound == false) {
            msg = "0 copies of " + itemTitle + " Found";
            System.out.println(msg);
        }
        return msg;
    }

    @Override
    public void checkoutItem(ArrayList<Item> items, Item item) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to borrow an item? (Enter Y or N)");
        String checkOUT = scanner.nextLine();
        String msg = "";
        String itemCheckout;
        if (checkOUT.equals("Y")) {
            System.out.println("Enter the name of an item?");
            itemCheckout = scanner.nextLine();
            for (int i = 0; i < items.size(); i++) {
                items.remove(item);
                msg = ("Updated:+\n" + "Item Borrowed : " + item.getTitle() + ", " + item.getQuantity() + " Available");
                System.out.println(msg);
                break;

            }
        }
    }

    @Override
    public void checkinItem(ArrayList<Item> items, Item item) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to check in" + item.getTitle() + "? (Enter Y or N)");
        String checkIN = scanner.nextLine();
        if (checkIN.equalsIgnoreCase("Y")) {
            for (int i = 0; i < items.size(); i++) {
                items.add(item);
                System.out.println("Updated:");
                System.out.println("Item Returned : " + item.getTitle() + ", " + item.getQuantity() + " Available");
                break;
            }
        } else {
            System.exit(0);
        }
    }

    /*
           Adds new item (book) to library if not already found.
    */
    @Override
    public void addItem(ArrayList<Item> items, Item newItem) {
        for (int i = 0; i < items.size(); i++) {
            if (!items.get(i).equals(newItem)) {
                items.add(newItem);
            } else {
                break;
            }
        }
    }

    /*
           Removes item (book) from library when found.
    */
    @Override
    public void removeItem(ArrayList<Item> items, Item newItem) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(newItem)) {
                items.remove(newItem);
                System.out.println("Removed " + newItem.getItemID());
                break;
            }
        }
        System.out.println(newItem.getItemID() + " Does not exist!");
    }

    /*
           Updates item (book) from library when found.
    */
    @Override
    public void updateItem(ArrayList<Item> items, Item newItem) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of item do you wish to update?");
        String itemType = scanner.nextLine();
        Item newItemUpdated;
        String title, publisher, publishedDate;
        int newUserID, numOfPages;
        boolean isAvailable;
        int quantity;

        if (itemType.toUpperCase().equals("Book")) {
            System.out.println("Enter a book title: ");
            title = scanner.nextLine();
            System.out.println("Enter the name of the publisher: ");
            publisher = scanner.nextLine();
            System.out.println("Enter the the published date: ");
            publishedDate = scanner.nextLine();
            System.out.println("Enter the item ID #: ");
            newUserID = scanner.nextInt();
            System.out.println("Available: ");
            isAvailable = scanner.nextBoolean();
            System.out.println("Enter a quantity: ");
            quantity = scanner.nextInt();
            System.out.println("");

            newItemUpdated = new Book(title, publisher, publishedDate, newUserID, isAvailable, quantity);
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).equals(newItem)) {
                    items.remove(newItem);
                    items.add(newItemUpdated);
                    System.out.println("Updated " + newItemUpdated.getItemID());
                    break;
                }
            }
            System.out.println(newItemUpdated.getItemID() + " Does not exist!");
        } else if (itemType.toUpperCase().equals("Magazine")) {
            System.out.println("Enter a magazine title: ");
            title = scanner.nextLine();
            System.out.println("Enter the name of the publisher: ");
            publisher = scanner.nextLine();
            System.out.println("Enter the the published date: ");
            publishedDate = scanner.nextLine();
            System.out.println("Enter the item ID #: ");
            newUserID = scanner.nextInt();
            System.out.println("Available: ");
            isAvailable = scanner.nextBoolean();
            System.out.println("Enter a quantity: ");
            quantity = scanner.nextInt();
            System.out.println("");
            System.out.println("Enter the the publisher address: ");
            String publishedAddress = scanner.nextLine();

            newItemUpdated = new Magazine(title, publisher, publishedDate, newUserID, isAvailable, quantity, publishedAddress);
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).equals(newItem)) {
                    items.remove(newItem);
                    items.add(newItemUpdated);
                    System.out.println("Updated " + newItemUpdated.getItemID());
                    break;
                }
            }
            System.out.println(newItemUpdated.getItemID() + " Does not exist!");
        } else if (itemType.toUpperCase().equals("Newspaper")) {
            System.out.println("Enter a newspaper title: ");
            title = scanner.nextLine();
            System.out.println("Enter the name of the publisher: ");
            publisher = scanner.nextLine();
            System.out.println("Enter the the published date: ");
            publishedDate = scanner.nextLine();
            System.out.println("Enter the item ID #: ");
            newUserID = scanner.nextInt();
            System.out.println("Enter the number of pages: ");
            numOfPages = scanner.nextInt();
            System.out.println("Available: ");
            isAvailable = scanner.nextBoolean();
            System.out.println("Enter a quantity: ");
            quantity = scanner.nextInt();
            System.out.println("");


            newItemUpdated = new Newspaper(title, publisher, publishedDate, newUserID, numOfPages, isAvailable, quantity);
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).equals(newItem)) {
                    items.remove(newItem);
                    items.add(newItemUpdated);
                    System.out.println("Updated " + newItemUpdated.getItemID());
                    break;
                }
            }
            System.out.println(newItemUpdated.getItemID() + " Does not exist!");
        } else {
            System.out.println(itemType + "Not Recognised!");
        }

    }

    /*
           Registers user (customer) details if not already found.
   */
    @Override
    public Customer registerPerson(ArrayList<Customer> users, int userID) {
        Customer newUser = new Customer(userID);
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(userID)) {
                System.out.println("User :" + userID + " already exists!");
            }
        }
        users.add(newUser);
        System.out.println("Added " + newUser.getCustomerID());
        return newUser;
    }

    /*
            Removes user (customer) from library when found.
     */
    @Override
    public void deletePerson(ArrayList<Customer> customers, Customer newUser) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).equals(newUser)) {
                customers.remove(newUser);
                System.out.println("Removed " + newUser.getCustomerID());
                break;
            }
        }
        System.out.println(newUser.getCustomerID() + " Does not exist!");
    }

    /*
        Updates person (customer) from library when found.
     */
    @Override
    public void updatePerson(ArrayList<Customer> customers, Customer newUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the item ID #: ");
        int newUserID = scanner.nextInt();
        System.out.println("");
        Customer newUserUpdated = new Customer(newUserID);
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).equals(newUser)) {
                customers.remove(newUser);
                customers.add(newUserUpdated);
                System.out.println("Updated " + newUserUpdated.getCustomerID());
                break;
            }
        }
        System.out.println(newUser.getCustomerID() + " Does not exist!");
    }
}

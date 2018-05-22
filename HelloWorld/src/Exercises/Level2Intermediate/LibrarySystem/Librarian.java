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
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(itemTitle)) {
                msg = items.get(i).getQuantity() + " copies of" + itemTitle + " Found";
                break;
            } else {
                msg = "0 copies of" + itemTitle + " Found";
                break;
            }
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

    public static void main(String[] args) {
        Library lib = new Library();
        Book myPreciousBook = new Book("The Hobbit", "J. R. R. Tolkien", "09/21/1937", 1230456, true, 1);
        Magazine someMag = new Magazine("Vogue", "Anna Wintour", "12/17/1892", 1230456, true, 1, "USA");
        Newspaper myNewspaper = new Newspaper("The Sun", "Sun Publishing Company", "10/6/2016", 1230456, 25, true, 1);

        Customer person1 = new Customer(120108432);
        Customer person2 = new Customer(120104421);
        Customer person3 = new Customer(120101790);
        Customer person4 = new Customer(120104568);
        Customer person5 = new Customer(000000000);
        Customer person111 = new Customer(111111111);

        ArrayList<Customer> users = new ArrayList<>();

        users.add(person1);
        users.add(person2);
        users.add(person3);
        users.add(person4);

        ArrayList<Item> items = new ArrayList<>();

        items.add(myPreciousBook);
        items.add(someMag);
        items.add(myNewspaper);

        Librarian someLibrarian = new Librarian("", "Librarian");

        someLibrarian.searchItem(items, "The Hobbit");
        someLibrarian.addItem(items, myPreciousBook);
        someLibrarian.checkoutItem(items, myPreciousBook);
        someLibrarian.checkinItem(items, myPreciousBook);
        someLibrarian.removeItem(items, myPreciousBook);
        someLibrarian.updateItem(items, myPreciousBook);
        someLibrarian.registerPerson(users, 120109567);
        someLibrarian.updatePerson(users, person111);
        someLibrarian.deletePerson(users, person5);
    }


}

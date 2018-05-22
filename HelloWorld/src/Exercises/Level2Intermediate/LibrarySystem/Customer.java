package Exercises.Level2Intermediate.LibrarySystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer implements User {

    private static int customerID;

    public Customer(int customerID) {
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    //    Searches Library for an item entered by the user

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

    public void checkoutItem(ArrayList<Item> items, Item item) {
        String msg;
        if (item.getAvailablity()) {
            item.setAvailable(false);
            msg = "ITEM: " + item + " AVAILABLE.";
            System.out.println(msg);
        } else {
            msg = "ITEM: " + item + " IS NOT AVAILABLE.";
            System.out.println(msg);
        }

    }

    public void renewBookItem(ArrayList<Item> items, Book bookItem) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to renew this item? (Enter: Y/N)");
        System.out.println("");
        String renew = scanner.nextLine();
        String renewalDate;
        if (renew.equalsIgnoreCase("Y")) {
            System.out.println("Enter the renewal date: ");
            renewalDate = scanner.nextLine();
            bookItem.setRenewalDate(renewalDate);
        } else {
            System.exit(0);
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


}

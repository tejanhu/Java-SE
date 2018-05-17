package Exercises.Level2Intermediate.LibrarySystem;

import java.util.ArrayList;

public class Customer implements User {

    private static int customerID;

    public Customer(int customerID) {
        this.customerID = customerID;
    }

    //    Searches Library for an item entered by the user
    public String searchItem(String someItem) {
        ArrayList<Library> library = new ArrayList<>();
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).equals(someItem)) {
                return "" + someItem + " Found!";
            }
        }
        return "" + someItem + " Not Found!";

    }

    @Override
    public void checkoutItem() {

    }

    @Override
    public void checkinItem() {

    }


}

package Exercises.Level2Intermediate.LibrarySystem;

import java.util.ArrayList;

public interface User {

    public String searchItem(ArrayList<Item> allItems, String itemTitle);

    public void checkoutItem(ArrayList<Item> allItems, Item item);

    public void checkinItem(ArrayList<Item> allItems, Item item);


}

package Exercises.Level2Intermediate.LibrarySystem;

import java.util.ArrayList;

public interface Admin extends User {

    public void addItem(ArrayList<Item> items, Item newItem);

    public void removeItem(ArrayList<Item> items, Item newItem);

    public void updateItem(ArrayList<Item> items, Item item);

    public Customer registerPerson(ArrayList<Customer> users, int userID);

    public void deletePerson(ArrayList<Customer> customers, Customer newUser);

    public void updatePerson(ArrayList<Customer> customers, Customer newUser);

    public void checkinItem(ArrayList<Item> items, Item item);

    public void checkoutItem(ArrayList<Item> items, Item item);
}

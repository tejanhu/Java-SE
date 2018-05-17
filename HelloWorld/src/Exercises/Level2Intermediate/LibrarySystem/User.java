package Exercises.Level2Intermediate.LibrarySystem;

public interface User {

    public String searchItem(String someItem);

    public String checkoutItem(Item item);

    public void checkinItem(Item item);


}

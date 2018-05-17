package Exercises.Level2Intermediate.LibrarySystem;

public class Book extends Item {
    int quantity = 0;

    protected Book(String title, String publisher, String publishedDate, int itemID, int quantity) {
        super(title, publisher, publishedDate, itemID);
        this.quantity = quantity;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}

package Exercises.Level2Intermediate.LibrarySystem;

public class Book extends Item {
    protected String renewalDate;

    protected Book(String title, String publisher, String publishedDate, int itemID, boolean isAvailable, int quantity) {
        super("", "", "", itemID, isAvailable, quantity);
        this.renewalDate = renewalDate;
    }

    protected String getrenewalDate() {
        return renewalDate;
    }

    protected void setRenewalDate(String renewalDate) {
        this.renewalDate = renewalDate;
    }


}

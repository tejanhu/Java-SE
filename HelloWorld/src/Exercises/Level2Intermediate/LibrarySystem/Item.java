package Exercises.Level2Intermediate.LibrarySystem;

public abstract class Item {
    private String title;
    private String publisher;
    private String publishedDate;
    private static int itemID;
    private boolean isAvailable;
    private int quantity;


    Item(String title, String publisher, String publishedDate, int itemID, boolean isAvailable, int quantity) {
        this.title = title;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.itemID = itemID;
        this.isAvailable = isAvailable;
        this.quantity = quantity;

    }

    protected boolean getAvailablity() {
        return isAvailable;
    }

    protected void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected String getPublisher() {
        return publisher;
    }

    protected void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    protected String getPublishedDate() {
        return publishedDate;
    }

    protected void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getItemID() {
        return itemID;
    }

    protected void setItemID(int itemID) {
        this.itemID = itemID;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){return "\nTitle: "+getTitle() + "\nPublisher: " + getPublisher() + "\nPublished Date: " + getPublishedDate() + "\nItem ID: " + getItemID() + "\nAvailable: " + getAvailablity() + "\nQuantity: " + getQuantity()+"\n";}


}

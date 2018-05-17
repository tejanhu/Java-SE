package Exercises.Level2Intermediate.LibrarySystem;

public abstract class Item {
    String title = "";
    String publisher = "";
    String publishedDate = "";
    int itemID;

    Item(String title, String publisher, String publishedDate, int itemID) {
        title = "";
        publisher = "";
        publishedDate = "";
        itemID = 0;
    }

    protected String getTitle() {
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

    protected int getItemID() {
        return itemID;
    }

    protected void setItemID(int itemID) {
        this.itemID = itemID;
    }


}

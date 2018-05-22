package Exercises.Level2Intermediate.LibrarySystem;

public class Magazine extends Item {
    protected String publisherAddress;

    protected Magazine(String title, String publisher, String publishedDate, int itemID, boolean isAvailable, int quantity, String publisherAddress) {
        super(title, publisher, publishedDate, itemID, isAvailable, quantity);
        this.publisherAddress = publisherAddress;

    }

    protected String getPublisherAddress() {
        return publisherAddress;
    }

    protected void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }


}

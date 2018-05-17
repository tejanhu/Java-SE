package Exercises.Level2Intermediate.LibrarySystem;

public class Magazine extends Item {
    String publisherAddress;

    protected Magazine(String title, String publisher, String publishedDate, int itemID, String publisherAddress) {
        super(title, publisher, publishedDate, itemID);
        this.publisherAddress = publisherAddress;

    }

    protected String getPublisherAddress() {
        return publisherAddress;
    }

    protected void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }


}

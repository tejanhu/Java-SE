package Exercises.Level2Intermediate.LibrarySystem;

import Exercises.Level2Intermediate.LibrarySystem.Item;

public class Newspaper extends Item {

    protected int numOfPages;

    protected Newspaper(String title, String publisher, String publishedDate, int itemID, int numOfPages, boolean isAvailable, int quantity) {
        super(title, publisher, publishedDate, itemID, isAvailable, quantity);
        this.numOfPages = numOfPages;
    }

    protected int getNumOfPages() {
        return numOfPages;
    }

    protected void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }


}

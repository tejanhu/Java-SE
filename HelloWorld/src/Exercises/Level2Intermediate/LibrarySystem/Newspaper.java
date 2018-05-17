package Exercises.Level2Intermediate.LibrarySystem;

import Exercises.Level2Intermediate.LibrarySystem.Item;

public class Newspaper extends Item {

    int numOfPages;

    public Newspaper(String title, String publisher, String publishedDate, int itemID, int numOfPages) {
        super(title, publisher, publishedDate, itemID);
        this.numOfPages = numOfPages;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }


}

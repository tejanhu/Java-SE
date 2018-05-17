package Exercises.Level2Intermediate.LibrarySystem;

public class Librarian implements Admin{

    public Librarian() {

    }

    public void checkoutItem() {

    }

    public void checkinItem() {

    }

    public void addItem() {

    }

    public void removeItem() {

    }

    public void updateItem() {

    }

    public void registerPerson(int userID) {

    }

    public void deletePerson(int userID) {

    }

    public void updatePerson() {

    }

    public static void main(String[] args) {
        Library lib = new Library();
        Book myPreciousBook = new Book("The Hobbit", "J. R. R. Tolkien", "09/21/1937", 1230456, 1);
        Magazine someMag = new Magazine("Vogue", "Anna Wintour", "12/17/1892", 1230456, "USA");
        Newspaper myNewspaper = new Newspaper("The Sun", "Sun Publishing Company", "10/6/1066", 1230456, 25);
    }

    @Override
    public String searchItem(String someItem) {
        return null;
    }

    @Override
    public String checkoutItem(Item item) {
        return null;
    }

    @Override
    public void checkinItem(Item item) {

    }
}

package Exercises.Level2Intermediate.LibrarySystem;

public interface Admin extends User {

    public String searchItem(String someItem);

    public void addItem();

    public void removeItem();

    public void updateItem();

    public void registerPerson(int userID);

    public void deletePerson(int userID);

    public void updatePerson();
}

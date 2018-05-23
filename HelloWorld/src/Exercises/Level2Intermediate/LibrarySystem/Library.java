package Exercises.Level2Intermediate.LibrarySystem;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {
        Book myPreciousBook = new Book("The Hobbit", "J. R. R. Tolkien", "09/21/1937", 1230456, true, 5);
        Magazine someMag = new Magazine("Vogue", "Anna Wintour", "12/17/1892", 1230456, true, 1, "USA");
        Newspaper myNewspaper = new Newspaper("The Sun", "Sun Publishing Company", "10/6/2016", 1230456, 25, true, 1);

        Customer person1 = new Customer(120108432);
        Customer person2 = new Customer(120104421);
        Customer person3 = new Customer(120101790);
        Customer person4 = new Customer(120104568);
        Customer person5 = new Customer(000000000);
        Customer person111 = new Customer(111111111);

        ArrayList<Customer> users = new ArrayList<>();

        users.add(person1);
        users.add(person2);
        users.add(person3);
        users.add(person4);

        ArrayList<Item> items = new ArrayList<>();

        items.add(myPreciousBook);
        items.add(someMag);
        items.add(myNewspaper);

        for (Item i : items) {
            System.out.println(i);
        }

        Librarian someLibrarian = new Librarian("", "Librarian");
        someLibrarian.searchItem(items, "The Hobbit");
        someLibrarian.searchItem(items, "Vogue");
        someLibrarian.searchItem(items, "The Sun");


    }


}

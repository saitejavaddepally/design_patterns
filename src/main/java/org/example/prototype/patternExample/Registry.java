package org.example.prototype.patternExample;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }

    public Item createItem (String type) {

        Item item = null;
        try {
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return item;
    }


    private void loadItems() {

        Movie movie = new Movie();
        movie.setTitle("Kalki");
        movie.setPrice(402);
        movie.setDuration("2 hours");

        items.put("Movie", movie);

        Book book = new Book();
        book.setPrice(2293);
        book.setTitle("some book");
        book.setNoOfPages(1010);

        items.put("book", book);

    }

}

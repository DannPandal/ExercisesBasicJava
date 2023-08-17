package com.pandal.exercise12;

public class LibraryItem {
    // element generic of the library ( book, DVD, CD, etc)
    private String id; //hashcode
    private String title;
    private boolean available; // true if the item is available to be loaned

    public LibraryItem() {
    }

    public LibraryItem(String id, String title, boolean available) {
        this.id = id;
        this.title = title;
        this.available = available;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return " * Detalles de LibraryItem:"
                + "\n\tIdentificador = " + this.id
                + "\n\tTítulo = " + this.title
                + "\n\tEsta disponible? = " + this.available;
    }
}



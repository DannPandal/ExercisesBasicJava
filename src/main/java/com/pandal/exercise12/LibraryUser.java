package com.pandal.exercise12;

import java.util.ArrayList;

public class LibraryUser {

    private String id; //hashcode
    private String name;
    private String lastName;
    private ArrayList<LibraryItem> borrowedLibraryItems;

    public LibraryUser() {
    }

    public LibraryUser(String id, String name, String lastName, ArrayList<LibraryItem> borrowedLibraryItems) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.borrowedLibraryItems = borrowedLibraryItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String apellido) {
        this.lastName = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String identifier) {
        this.id = identifier;
    }

    public ArrayList<LibraryItem> getBorrowedLibraryItems() {
        return borrowedLibraryItems;
    }

    public void setBorrowedLibraryItems(ArrayList<LibraryItem> borrowedLibraryItems) {
        this.borrowedLibraryItems = borrowedLibraryItems;
    }

    public String getFullName() {
        return this.name + " " + this.lastName;
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder();
        details.append(" * Detalles del Usuario:")
                .append("\n\tID = ").append(this.id)
                .append("\n\tNombre = ").append(this.name)
                .append("\n\tApellido = ").append(this.lastName)
                .append("\n\tCantidad elementos prestados = ").append(this.borrowedLibraryItems.size());

        return details.toString();
    }
}

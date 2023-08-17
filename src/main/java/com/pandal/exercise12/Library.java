package com.pandal.exercise12;

import java.util.ArrayList;

public class Library { // class Biblioteca
    private static ArrayList<LibraryItem> libraryItems;

    static {
        libraryItems = new ArrayList<>();
    }

    public Library() {
    }

    public static ArrayList<LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public static void addLibraryItem(LibraryItem libraryItem) {
        libraryItems.add(libraryItem);
    }

    public static LibraryItem getLibraryItemById(String id) {
        LibraryItem libraryItem = null;
        for (LibraryItem item : libraryItems) {
            if (item.getId().equals(id)) {
                libraryItem = item;
                break;
            }
        }
        return libraryItem;
    }
    public static LibraryItem getLibraryItemByTitle(String title) {
        LibraryItem libraryItem = null;
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equals(title)) {
                libraryItem = item;
                break;
            }
        }
        return libraryItem;
    }

    public static boolean borrowLibraryItemToUser(String id, LibraryUser libraryUser) {
        boolean isBorrowed = false;
        String title = "";
        for (LibraryItem libraryItem : libraryItems) {
            if (libraryItem.getId().equals(id) && libraryItem.isAvailable()) {
                libraryItem.setAvailable(false);
                libraryUser.getBorrowedLibraryItems().add(libraryItem);
                isBorrowed = true;
                title = libraryItem.getTitle();
                break;
            }
        }
        System.out.println("Item " + title + (isBorrowed ? " prestado" : "no prestado, porque no esta disponible o no se encontro") );
        return isBorrowed;
    }

    public static boolean returnLibraryItemToUser(String id, LibraryUser libraryUser) {
        boolean isReturned = false;
        String title = "";
        for (LibraryItem libraryItem : libraryItems) {
            if (libraryItem.getId().equals(id) && !libraryItem.isAvailable()) {
                libraryItem.setAvailable(true);
                libraryUser.getBorrowedLibraryItems().remove(libraryItem);
                isReturned = true;
                title = libraryItem.getTitle();
                break;
            }
        }
        System.out.println("Item " +title +  (isReturned ? " " : " no ") + "devuelto");
        return isReturned;
    }


}

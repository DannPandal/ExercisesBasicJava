package com.pandal.exercise12;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Exercise12 {
    public static void main(String[] args) {


        // * Usuarios
        LibraryUser user1 = new LibraryUser(UUID.randomUUID().toString(), "Dann", "Pandal", new ArrayList<>());
        LibraryUser user2 = new LibraryUser();
        String idUser2 = UUID.randomUUID().toString();
        user2.setId(idUser2);
        user2.setName("Xiomara");
        user2.setLastName("Arroyo");
        user2.setBorrowedLibraryItems(new ArrayList<>());

        // * Libros y DVDs
        LibraryItem itemBook1 = new Book(UUID.randomUUID().toString(), "El señor de los anillos", true, "J.R.R. Tolkien");
        LibraryItem itemBook2 = new Book(UUID.randomUUID().toString(), "El hobbit", true, "J.R.R. Tolkien");
        LibraryItem idemDVD1 = new DVD(UUID.randomUUID().toString(), "Titanic", true, "James Cameron", 195);
        DVD dvd2 = new DVD();
        String idDVD2 = UUID.randomUUID().toString();
        dvd2.setId(idDVD2);
        dvd2.setTitle("El Padrino");
        dvd2.setDirector("Francis Ford Coppola");
        dvd2.setDuration(175);
        dvd2.setAvailable(true);

        // *********************** Agrandando todos los items a library ***********************

        Library.addLibraryItem(itemBook1);
        Library.addLibraryItem(itemBook2);
        Library.addLibraryItem(idemDVD1);
        Library.addLibraryItem((LibraryItem) dvd2);


        try {
            ObjectMapper mapper = new ObjectMapper();
            File jsonFileBook = new File("src/main//java/com/pandal/exercise12/dataBooks.json");
            List<Book> bookList = mapper.readValue(jsonFileBook, new TypeReference<List<Book>>() {
            });
            for (Book book : bookList) {
                book.setId(UUID.randomUUID().toString());
                Library.addLibraryItem((LibraryItem) book);
            }

            File jsonFileDVD = new File("src/main//java/com/pandal/exercise12/dataDVDs.json");
            List<DVD> dvdList = mapper.readValue(jsonFileDVD, new TypeReference<List<DVD>>() {
            });
            for (DVD dvd : dvdList) {
                dvd.setId(UUID.randomUUID().toString());
                Library.addLibraryItem((LibraryItem) dvd);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // **********************************************


        // *********************** Acciones ***********************

        // * View all element in library

        System.out.println("\n\n ********** Library Items **********");
        for (LibraryItem item : Library.getLibraryItems()) {
            System.out.println(item);
        }
        System.out.println("\n\n ********** Users **********");
        System.out.println(user1);
        System.out.println(user2);


        // * borrow of library items
        System.out.println("\n\nPrestando Libros y DVDs a usuario 1: " + user1.getFullName());
        Library.borrowLibraryItemToUser(itemBook2.getId(), user1);
        Library.borrowLibraryItemToUser(idDVD2, user1);
        Library.borrowLibraryItemToUser(Library.getLibraryItemByTitle("Drácula").getId(), user1);
        Library.borrowLibraryItemToUser(Library.getLibraryItemByTitle("Forrest Gump").getId(), user1);

        System.out.println("\n\nPrestando Libros y DVDs a usuario 2: " + user2.getFullName());
        Library.borrowLibraryItemToUser(itemBook1.getId(), user2);
        Library.borrowLibraryItemToUser(idDVD2, user2);
        Library.borrowLibraryItemToUser(Library.getLibraryItemByTitle("Cien años de soledad").getId(), user2);
        Library.borrowLibraryItemToUser(Library.getLibraryItemByTitle("Gladiator").getId(), user2);

        // * return of library items
        System.out.println("\n\nDevolviendo Libros y DVDs de usuario");
        Library.returnLibraryItemToUser(idDVD2, user1);
        Library.returnLibraryItemToUser(Library.getLibraryItemByTitle("Cien años de soledad").getId(), user2);


        System.out.println("\n\n\n ********** Usuarios al final **********");
        System.out.println(user1);
        System.out.println("******* Items Prestados:");
        for (LibraryItem item : user1.getBorrowedLibraryItems()) {
            System.out.println("Item : " + item);
        }
        System.out.println("\n\n" + user2);
        System.out.println("******* Items Prestados:");
        for (LibraryItem item : user2.getBorrowedLibraryItems()) {
            System.out.println("Item : " + item);
        }

        System.out.println("\n\n\n ********** Libros al final **********");
        for (LibraryItem item : Library.getLibraryItems()) {
            System.out.println(item);
        }

    }

}

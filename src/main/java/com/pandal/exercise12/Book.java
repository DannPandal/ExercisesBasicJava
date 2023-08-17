package com.pandal.exercise12;

public class Book extends LibraryItem {

    private String author;

    public Book() {
    }

    public Book(String id, String title, boolean available, String author) {
        super(id, title, available);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // sobreescritura toString para mostrar los detalles del libro
    @Override
    public String toString() {
        StringBuilder details = new StringBuilder();
        details.append(" * Detalles de ").append(this.getClass().getSimpleName())
                .append("\n\tIdentificador = ").append(this.getId())
                .append("\n\tTítulo = ").append(this.getTitle())
                .append("\n\tAutor = ").append(this.author)
                .append("\n\t").append(this.isAvailable() ? "Si" : "No").append(" esta disponible");
        return details.toString();
    }
}

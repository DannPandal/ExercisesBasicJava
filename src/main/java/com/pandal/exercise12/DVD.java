package com.pandal.exercise12;

public class DVD extends LibraryItem{
    private String director;
    private int duration;  // minutes

    public DVD() {
    }

    public DVD(String id, String title, boolean available, String director, int duration) {
        super(id, title, available);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if (director != null && !director.isEmpty()) {
            this.director = director;
        }
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        }
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder();
        details.append(" * Detalles de ").append(this.getClass().getSimpleName())
                .append("\n\tIdentificador = ").append(this.getId())
                .append("\n\tTítulo = ").append(this.getTitle())
                .append("\n\tDirector = ").append(this.director)
                .append("\n\tDuración = ").append(this.duration).append(" minutos")
                .append("\n\t").append(this.isAvailable() ? "Si" : "No").append(" esta disponible");
        return details.toString();
    }
}

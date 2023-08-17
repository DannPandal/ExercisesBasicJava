package com.pandal.exercise11;

public class Figure {

    private String color;
    private boolean filled; // with color filled

    public Figure() {
    }

    public Figure(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}

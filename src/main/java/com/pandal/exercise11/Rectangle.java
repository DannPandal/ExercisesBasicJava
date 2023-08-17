package com.pandal.exercise11;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder();
        details.append(" * La Figura es un ").append(this.getClass().getSimpleName())
                .append("\n Color: ").append(this.getColor())
                .append("\n Esta lleno? ").append(this.isFilled() ? "Si" : "No")
                .append("\n Ancho = ").append(this.getWidth())
                .append("\n Alto = ").append(this.getHeight())
                .append("\n Area = ").append(this.getArea())
                .append("\n Perímetro = ").append(this.getPerimeter());
        return details.toString();
    }
}

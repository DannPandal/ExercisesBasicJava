package com.pandal.exercise11;

public class Circle extends Figure {

    private double radius;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled); // call the constructor of the superclass
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * getDiameter();
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder();
        details.append(" * La Figura es un ").append(this.getClass().getSimpleName())
                .append("\n Color: ").append(this.getColor())
                .append("\n Esta lleno? ").append(this.isFilled() ? "Si" : "No")
                .append("\n Radio = ").append(this.getRadius())
                .append("\n Area = ").append(this.getArea())
                .append("\n Perímetro = ").append(this.getPerimeter())
                .append("\n Diametro = ").append(this.getDiameter());
        return details.toString();
    }
}

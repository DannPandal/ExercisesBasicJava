package com.pandal.exercise11;

public class Triangle extends Figure{
    private double sidea;
    private double sideb;
    private double sidec;

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double sidea, double sideb, double sidec) {
        super(color, filled);
        this.sidea = sidea;
        this.sideb = sideb;
        this.sidec = sidec;
    }

    public double getSidea() {
        return sidea;
    }

    public void setSidea(double sidea) {
        this.sidea = sidea;
    }

    public double getSideb() {
        return sideb;
    }

    public void setSideb(double sideb) {
        this.sideb = sideb;
    }

    public double getSidec() {
        return sidec;
    }

    public void setSidec(double sidec) {
        this.sidec = sidec;
    }

    public double getArea() {
        double s = getPerimeter() / 2; // semiperimeter
        return Math.sqrt(s * (s - this.sidea) * (s - this.sideb) * (s - this.sidec));
    }

    public double getPerimeter() {
        return this.sidea + this.sideb + this.sidec;
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder();
        details.append(" * La Figura es un ").append(this.getClass().getSimpleName())
                .append("\n Color: ").append(this.getColor())
                .append("\n Esta lleno? ").append(this.isFilled() ? "Si" : "No")
                .append("\n Lado a = ").append(this.getSidea())
                .append("\n Lado b = ").append(this.getSideb())
                .append("\n Lado c = ").append(this.getSidec())
                .append("\n Area = ").append(this.getArea())
                .append("\n Perímetro = ").append(this.getPerimeter());
        return details.toString();
    }
}

package com.pandal.exercise11;

public class Exercise11 {

    public static void main(String[] args) {

        Circle circle1 = new Circle("blue", false, 5);
        Circle circle2 = new Circle();
        circle2.setColor("black");
        circle2.setFilled(true);
        circle2.setRadius(8);

        Rectangle rectangle1 = new Rectangle("yellow", true, 9, 12);
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setColor("white");
        rectangle2.setFilled(false);
        rectangle2.setWidth(8);
        rectangle2.setHeight(15);

        Triangle triangle1 = new Triangle("green", true, 3, 8, 10);
        Triangle triangle2 = new Triangle();
        triangle2.setColor("brown");
        triangle2.setFilled(true);
        triangle2.setSidea(15);
        triangle2.setSideb(12);
        triangle2.setSidec(21);

        System.out.println("\n\n ********** Circulos **********");
        System.out.println("Datos del circulo 1: \n" + circle1.toString());
        System.out.println("Datos del circulo 2: \n" + circle2.toString());
        System.out.println("El area del circulo 1 es: " + circle1.getArea());
        System.out.println("El perimetro del circulo 1 es: " + circle1.getPerimeter());


        System.out.println("\n\n ********** Rectangulos **********");
        System.out.println("Datos del rectangulo 1: \n" + rectangle1.toString());
        System.out.println("Datos del rectangulo 2: \n" + rectangle2.toString());


        System.out.println("\n\n ********** Triangulos **********");
        System.out.println("Datos del triangle 1: \n" + triangle1.toString());
        System.out.println("Datos del triangle 2: \n" + triangle2.toString());

    }
}


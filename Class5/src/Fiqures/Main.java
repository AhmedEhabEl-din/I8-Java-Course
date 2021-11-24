package Fiqures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(4);
        System.out.println(circle.getArea());

        Square square = new Square(5);
        System.out.println(square.getArea());

        Figure figure;
        figure = new Circle(4);
        System.out.println(figure.getArea());

        figure = new Square(5);
        System.out.println(figure.getArea());
    }
}

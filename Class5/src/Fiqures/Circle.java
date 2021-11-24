package Fiqures;

public class Circle implements Figure , SayMyName{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String word) {
        this.radius = radius;
        System.out.println(word);
    }

    public static void sayHelloFromFiq() {
        System.out.println("Hello from circle");
    }

    @Override
    public double getArea() {
        return radius * radius * pi;
    }

    @Override
    public double getParameter() {
        return 2 * pi * radius;
    }

    @Override
    public String myNameIs() {
        return "I am a Circle";
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

package Fiqures;

public class Square implements Figure {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getParameter() {
        return side * 4;
    }
}

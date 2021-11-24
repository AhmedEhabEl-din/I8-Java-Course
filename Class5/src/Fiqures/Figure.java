package Fiqures;

public interface Figure {

    double pi = 3.14;

    double getArea();
    double getParameter();

    default  String SayHello(){
        return "Hello";
    }

}

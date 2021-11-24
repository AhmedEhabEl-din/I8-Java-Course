package CW1;

import Fiqures.Circle;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {

        String[] arrayStrings = new String[]{"Hey"};
        System.out.println(returnArrayOfCircles());
        System.out.println(Arrays.toString(returnArrayOfCircles()));
    }

    public static Circle[] returnArrayOfCircles(){
        Circle[] circles = new Circle[10];
        for (int i = 0; i <circles.length ; i++) {
            circles[i] = new Circle(i);
        }
        return circles;
    }
}

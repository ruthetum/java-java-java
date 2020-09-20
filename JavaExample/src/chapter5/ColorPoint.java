package chapter5;

import java.awt.*;

/*
예제 5-1 : 클래스 상속 만들어 보기

(x,y)의 한 점을 표현하는 Point 클래스와 이를 상속받아
컬러 점을 표현하는 ColorPoint 클래스를 만들어보자.
 */
public class ColorPoint extends Point{
    private String color;

    void setColor(String color) {
        this.color = color;
    }

    void printPointAndColor() {
        printPoint();
        System.out.println("Color : " + color);
    }

    public static void main(String[] args) {
        ColorPoint point = new ColorPoint();
        point.setPoint(3, 4);
        point.setColor("Green");
        point.printPointAndColor();
    }
}

class Point {
    private double x;
    private double y;

    void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void printPoint() {
        System.out.println("(X, Y) : (" + x + ", " + y +")");
    }
}
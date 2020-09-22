package chapter7;

import java.util.Vector;

/*
예제 7-2 Point 클래스의 객체들만 저장하는 벡터 만들기

(x, y) 한 점을 추상화한 Point 클래스를 만들고
Point 클래스의 객체만 저장하는 벡터를 작성하라.
 */
public class PointVecter {
    public static void main(String[] args) {
        Vector<Point> v = new Vector<>();

        v.add(new Point(1, 3));
        v.add(new Point(-3, 4));
        v.add(new Point(5.3, -2.7));

        for (int i=0; i<v.size(); i++) {
            Point p = v.get(i);
            System.out.println(p.toString());
        }
        System.out.println("capacity : " + v.capacity());
    }
}

class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

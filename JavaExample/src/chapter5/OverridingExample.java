package chapter5;
/*
예제 5-5 : 메소드 오버라이딩

Car을 상속받는 SportsCar라는 새로운 클래스를 만들고
SportsCar 클래스에서 getSpeed() 메소드를 재정의하라.
 */
public class OverridingExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(100);
        c.getSpeed();

        SportsCar s = new SportsCar();
        s.setSpeed(200);
        s.getSpeed();
    }
}

class Car {
    int speed;
    void setSpeed(int s) {
        this.speed = s;
    }
    void getSpeed() {
        System.out.println("자동차의 속도는 " + speed + "km/h 입니다.");
    }
}

class SportsCar extends Car {
    void getSpeed() {
        System.out.println("스포츠카의 속도는 " + speed + "km/h 입니다.");
        System.out.println("최대속도는 400km/h 입니다.");
    }
}
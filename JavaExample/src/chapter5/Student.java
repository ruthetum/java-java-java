package chapter5;
/*
예제 5-2: 상속 관계에 있는 클래스 간 멤버 접근

클래스 Person을 아래와 같은 멤버 필드를 갖도록 선언하고
클래스 Student는 클래스 Person을 상속받아 각 멤버 필드에 값을 저장하시오.
이 예제에서 Person 클래스의 private 필드인 weight는 Student 클래스에서는 접근이 불가능하여
슈퍼 클래스인 Person의 get, set 메소드를 통해서만 조작이 가능하다.

int age;
public String name;
protected int height;
private int weight;
 */
public class Student extends Person {
    void init(int a, String n, int h, int w) {
        this.age = a;
        this.name = n;
        this.height = h;
        setWeight(w);
    }
    void infoStudent() {
        System.out.println("name : " + this.name);
        System.out.println("age : " + this.age);
        System.out.println("height : " + this.height);
        System.out.println("weight : " + getWeight());
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.init(20, "mike", 170, 60);
        student.infoStudent();
    }
}

class Person {
    int age;    // default
    public String name;
    protected int height;
    private int weight;

    int getWeight() {
        return this.weight;
    }

    void setWeight(int w) {
        this.weight = w;
    }
}
package chapter4;

/*
예제4-1 상품 하나를 표현하는 클래스 Goods 만들기 (Goods -> example1)

상품 하나를 표현하는 클래스 Goods를 작성하라.
상품은 String 타입의 name, int 타입의 price, numberOfStock, sold 등 네 개의 필드를 갖는다.
Goods 클래스 내에 main() 메소드를 작성하여 Goods 객체를 하나 생성하고
이 객체에 대한 레퍼런스 변수 명을 camera로 하라.
그리고 나서 camera의 상품 이름(name 필드)을 “Nikon”, 값(price)을 400000,
재고수(numberOfStock)를 30, 팔린 개수(sold)를 50으로 설정하라.
그리고 설정된 이들 값을 화면에 출력하라.
 */

public class example1 {
    private String name;
    private int price;
    private int numberOfStock;
    private int sold;

    public example1(String name, int price, int numberOfStock, int sold) {
        this.name = name;
        this.price = price;
        this.numberOfStock = numberOfStock;
        this.sold = sold;
    }

    public static void main(String []args) {
        example1 camera = new example1("Nikon", 400000, 30, 50);
        System.out.println(camera.name);
        System.out.println(camera.price);
        System.out.println(camera.numberOfStock);
        System.out.println(camera.sold);
    }
}

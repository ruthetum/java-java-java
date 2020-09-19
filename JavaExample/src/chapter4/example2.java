package chapter4;

/*
예제 4-2 : 지수 클래스 MyExp 만들기 (MyExp -> example2)

클래스 MyExp를 작성하라.
MyExp는 지수값을 표현하는 클래스로서 두 개의 정수형 멤버 필드 base와 exp를 가진다.
2^3의 경우 base는 2이며, exp는 3이다.
base와 exp는 양의 정수만을 가지는 것으로 가정한다.
또한 MyExp는 정수값을 리턴하는 getValue()라는 메소드를 제공한다.
getValue()는 base와 exp 값으로부터 지수를 계산하여 정수 값으로 리턴한다.
예를 들어 MyExp객체의 base 필드가 2이고 exp가 3이라면 getValue()는 8을 리턴한다.
 */

public class example2 {
    int base; // java에는 unsigned가 없다!
    int exp;
    int getValue(){
        int expValue = 1;
        for (int i=0; i<this.exp; i++) {
            expValue *= this.base;
        }
        return expValue;
    }

    public static void main(String []args) {
        example2 myExp1 = new example2();
        myExp1.base = 2;
        myExp1.exp = 5;
        System.out.println(myExp1.getValue());
    }
}

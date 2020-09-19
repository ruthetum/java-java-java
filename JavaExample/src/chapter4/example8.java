package chapter4;
/*
예제 4-8 : static을 이용한 달러와 우리나라 원화 사이의 변환 예제

static 필드와 메소드를 이용하여 달러와 한국 원화 사이의 변환을 해주는 환율 계산기를 만들어 보자.
 */
public class example8 {
    private static double rate;
    public static void setRate(double r) {
        rate = r;
    }
    public static double exchangeToWon(double dollar) {
        return dollar * rate;
    }
    public static double exchangeToDollar(double won) {
        return won / rate;
    }

    public static void main(String[] args) {
        example8.setRate(1200);
        System.out.println("1달러는 " + example8.exchangeToWon(1) + "원입니다.");
        System.out.println("6000원은 " + example8.exchangeToDollar(6000) + "달러입니다.");
    }
}

package chapter4;

import java.util.Scanner;

/*
예제 4-3 : 객체 배열 생성
(클래스 명 : Goods 객체 배열 -> example3, Goods 객체 -> Goods)

Scanner 클래스를 이용하여 상품을 입력 받아 Goods 객체를 생성하고
이들을 Goods 객체 배열에 저장하라.
상품을 3개 입력 받으면 이들을 모두 화면에 출력하라.

[INPUT]
콜라 500 10 20
사이다 1000 20 30
맥주 2000 30 50
[OUTPUT]
콜라 500 10 20
사이다 1000 20 30
맥주 2000 30 50
 */
public class example3 {
    public static void main(String []args) {
        Goods[] goodsArray = new Goods[3];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            String input = sc.nextLine();
            String[] goodsInfo = input.split(" ");
            goodsArray[i] = new Goods(
                    goodsInfo[0],
                    Integer.parseInt(goodsInfo[1]),
                    Integer.parseInt(goodsInfo[2]),
                    Integer.parseInt(goodsInfo[3])
            );
        }
        for (int i=0; i<3; i++) {
            System.out.print(goodsArray[i].name + " "
                            + goodsArray[i].val1 + " "
                            + goodsArray[i].val2 + " "
                            + goodsArray[i].val3 + "\n"
            );
        }
    }
}

class Goods {
    String name;
    int val1;
    int val2;
    int val3;

    public Goods(String name, int val1, int val2, int val3) {
        this.name = name;
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }
}

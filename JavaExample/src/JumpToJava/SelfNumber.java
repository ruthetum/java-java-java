package JumpToJava;
/*
Jump to Java 08-3 : Self Number

이번에는 넥슨의 입사 문제였다는 "Self Number" 찾기를 풀이 해 보자.
문제는 다음과 같다.
어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.
예를 들어
d(91) = 9 + 1 + 91 = 101
이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.
어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다.
그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다.
예를 들어 1, 3, 5, 7, 9, 20, 31 은 셀프 넘버 들이다.
1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.
 */
public class SelfNumber {
    public static void main(String[] args) {
        int sumSelfNumber = 0;
        int check = 0;
        int[] array = new int[5000];
        for (int a=0; a<5; a++) {
            for (int b=0; b<10; b++) {
                for (int c=0; c<10; c++) {
                    for (int d=0; d<10; d++) {
                        check = 1001*a + 101*b + 11*c + 2*d;
                        if (check < 5000) {
                            array[check] = 1;
                        }
                    }
                }
            }
        }
        for (int i=1; i<5000; i++) {
            if (array[i] != 1)
                sumSelfNumber += i;
        }
        System.out.println("[SUM] : " + sumSelfNumber);
    }
}

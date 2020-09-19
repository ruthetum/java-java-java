package JumpToJava;

import java.util.Scanner;

/*
Jump to Java 08-2 : Multiples of 3 and 5

프로젝트 오일러에 대해서 들어본적이 있는가?
프로젝트 오일러는 프로그래밍 퀴즈를 풀이하는 곳으로 전 세계적으로 유명하다.
이 곳에서 제공하는 퀴즈 중 가장 첫번째 인 "Multiples of 3 and 5" 를 함께 풀어보도록 하자.
문제링크 : http://projecteuler.net/problem=1
문제는 다음과 같다.

10 미만의 자연수에서 3과 5의 배수를 구하면 3, 5, 6, 9이다.
이들의 총합은 23이다. 1000미만의 자연수에서 3, 5의 배수의 총합을 구하라.
 */
public class multiplesOf3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("[INPUT] : ");
        int input = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i=1; i<input; i++) {
            if (i%3 == 0 || i%5 == 0)
                sum += i;
        }
        System.out.println("[OUTPUT] : " + sum);
    }
}

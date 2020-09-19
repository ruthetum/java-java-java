package chapter4;

import java.util.Scanner;

/*
예제 4-4 : 배열의 전달

char 배열을 메소드의 인자로 전달하여 배열 속의 공백(' ')문자를 ‘,’로 대치하는 프로그램을 작성하라.
(String 배열이 input으로 들어왔다고 생각하고 replace)

[INPUT]
This is a pencil.
[OUTPUT]
This,is,a,pencil.

 */
public class example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.replace(" ", ",");
        System.out.println(input);
    }
}

package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

/*
예제 7-3 : ArrayList에 문자열을 추가하기

키보드로 문자열을 3번 입력 받아 ArrayList에 삽입하고
입력받은 값 중 가장 긴 이름을 출력하라.
 */
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            arrayList.add(sc.nextLine());
        }

        int longestIndex = 0;
        for (int i=0; i<arrayList.size(); i++) {
            if (arrayList.get(longestIndex).length() < arrayList.get(i).length()) {
                longestIndex = i;
            }
        }
        System.out.println(arrayList.get(longestIndex));
    }
}

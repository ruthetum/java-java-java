package JumpToJava;

import java.util.ArrayList;

/*
똑같은 Self Number 문제
저번 풀이는 너무 시간복잡도가 커서 효율적으로 다시 작성해봤다.
 */
public class SelfNumber2 {
    public static void main(String[] args) {
        int sumSelfNumber = 0;
        int[] checkList = new int[5000];
        for (int i=1; i<5000; i++) {
            int check = i;
            String str = i + "";
            String[] eachNumbers = str.split("");
            for (String eachNumber : eachNumbers) {
                check += Integer.parseInt(eachNumber);
            }
            if (check < 5000)
                checkList[check] = 1;
        }

        for (int i=1; i<5000; i++) {
            if (checkList[i] != 1)
                sumSelfNumber += i;
        }
        System.out.println("[SUM] : " + sumSelfNumber);
    }
}

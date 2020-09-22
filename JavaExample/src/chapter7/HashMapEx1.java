package chapter7;

import java.util.HashMap;
import java.util.Scanner;

/*
예제 7-5 : HashMap을 이용하여 영어 단어와 한글 단어를 쌍으로 저장하고 검색하는 사례

영어 단어와 한글 단어를 쌍으로 HashMap에 저장하고
영어 단어로 한글 단어를 검색하는 프로그램을 작성하라.
 */
public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String findWord;

        for (int i=0; i<3; i++) {
            System.out.print("[" + (i+1) + "]영어 단어 : ");
            String enWord = sc.nextLine();
            System.out.print("[" + (i+1) + "]한글 단어 : ");
            String koWord = sc.nextLine();
            dic.put(enWord, koWord);
        }

        System.out.print("검색할 영어 단어 : ");
        findWord = sc.nextLine();
        System.out.println(dic.get(findWord));
    }
}

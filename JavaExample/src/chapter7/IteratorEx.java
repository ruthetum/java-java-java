package chapter7;

import java.util.ArrayList;
import java.util.Iterator;

/*
예제 7-4 : Iterator를 이용하여 ArrayList의 모든 요소 출력하고 합 구하기

ArrayList<Integer>로부터 Iterator를 얻어내고
벡터의 모든 정수를 출력하고 합을 구하라.
 */
public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0;

        al.add(1);
        al.add(3);
        al.add(5);
        al.add(7);
        al.add(9);

        Iterator<Integer> iterator = al.iterator();
        while(iterator.hasNext()) {
            int n = iterator.next();
            System.out.println(n);
            sum += n;
        }

        System.out.println("sum : " + sum);
    }
}

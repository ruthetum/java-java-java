package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
예제 7-6 HashMap을 이용하여 자바 과목의 점수를 기록 관리하는 코드 작성

HashMap을 이용하여 학생의 이름과 자바 점수를 기록 관리해보자.
 */
public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("aaa", 70);
        map.put("bbb", 100);
        map.put("ccc", 15);
        map.put("ddd", 90);
        map.put("eee", 50);

        Set<String> keys = map.keySet();

        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            String name = it.next();
            System.out.println(name + " : " + map.get(name));
        }
    }
}

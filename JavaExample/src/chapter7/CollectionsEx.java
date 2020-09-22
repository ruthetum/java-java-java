package chapter7;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/*
예제 7-8 : Collections 클래스의 활용

Collections 클래스를 활용하여
문자열 정렬, 반대로 정렬, 이진 검색 등을
실행하는 사례를 살펴보자.
 */
public class CollectionsEx {
    static void printList(LinkedList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String separator;
            String e = it.next();
            if (it.hasNext()) {
                separator = " -> ";
            } else {
                separator = "\n";
            }
            System.out.print(e + separator);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("bbb");
        linkedList.add("aaa");
        linkedList.add("eee");
        linkedList.add("ddd");
        linkedList.add("ccc");

        // sort
        Collections.sort(linkedList);
        System.out.print("sort : ");
        printList(linkedList);

        // reverse
        Collections.reverse(linkedList);
        System.out.print("reverse : ");
        printList(linkedList);

        // search
        String findElement = "ccc";
        int index = Collections.binarySearch(linkedList, findElement) + 1;
        System.out.print(findElement + " : " + index + "번째 element");
    }
}

package chapter4;
/*
예제 4-5 : 생성자 정의와 호출
(클래스명 : Book -> example5
클래스 Book을 String title, String author, int ISBN의 3개의 필드를 갖도록 정의하라.
 */
public class example5 {
    private String title;
    private String author;
    private int ISBN;

    public example5(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public static void main(String[] args) {
        example5 book = new example5("데미안", "헤르만 헤세", 111);
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.ISBN);
    }
}

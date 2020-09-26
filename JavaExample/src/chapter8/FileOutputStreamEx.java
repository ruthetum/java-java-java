package chapter8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
예제 8-2 : FileOutputStream을 이용한 파일 쓰기

정수 타입의 결과 값을 FileOutputStream을 이용하여 파일에 저장한다.
다시 이 파일에서 정수형 변수로 읽고 이전에 계산된 결과 값과 같은지 확인하라.
 */
public class FileOutputStreamEx {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;

        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\DELL\\Desktop\\test.out");
            for (int i=1; i<=10; i++) {
                fileOutputStream.write(i);
            }
            fileOutputStream.close();

            fileInputStream = new FileInputStream("C:\\Users\\DELL\\Desktop\\test.out");
            int c;
            while ((c=fileInputStream.read()) != -1) {
                System.out.print(c + " ");
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

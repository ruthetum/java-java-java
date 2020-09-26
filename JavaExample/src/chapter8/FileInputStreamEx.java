package chapter8;

import java.io.FileInputStream;
import java.io.IOException;

/*
예제 8-1 : 윈도우에 있는 system.ini 파일을 읽어 화면에 출력하기

FileInputStream을 이용하여 사용자 컴퓨터의 windows 디렉터리에 있는 system.ini 파일을 읽고 화면에 출력하라.
system.ini 파일은 텍스트 파일이다.
 */
public class FileInputStreamEx {
    public static void main(String[] args) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("c:\\windows\\system.ini");
            int c;
            while ((c=fileInputStream.read()) != -1) {
                System.out.print((char) c);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

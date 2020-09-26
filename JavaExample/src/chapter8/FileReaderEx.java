package chapter8;

import java.io.FileReader;
import java.io.IOException;

/*
예제 8-3 : FileReader를 이용한 텍스트 파일 읽기 - system.ini 파일 읽기

FileReader를 이용하여 사용자 컴퓨터의 windows 디렉터리에 있는 system.ini 파일을 읽고 화면에 출력하라.
system.ini 파일은 텍스트 파일이다.
 */
public class FileReaderEx {
    public static void main(String[] args) {
        FileReader fileReader;
        try {
            fileReader = new FileReader("c:\\windows\\system.ini");
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

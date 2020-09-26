package chapter8;

import jdk.internal.util.xml.impl.Input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
예제 8-4 : 한글 텍스트 파일 읽기

InputStreamReader를 이용하여 한글 텍스트 파일을 읽고 출력하라.
 */
public class InputStreamReaderEx {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader;
        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream("c:\\Users\\Dell\\Desktop\\test.txt");
            inputStreamReader = new InputStreamReader(fileInputStream);

            int c;
            while ((c = inputStreamReader.read()) != -1) {
                System.out.print((char) c);
            }

            inputStreamReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

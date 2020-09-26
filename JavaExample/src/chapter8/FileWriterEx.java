package chapter8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
예제 8-6 : 키보드 입력을 파일로 저장하기

키보드에서 입력 받은 데이터를 c:\Users\Dell\Desktop\test.txt 파일에 저장하는 코드를 작성하라.
 */
public class FileWriterEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fileWriter;
        int c;

        try {
            fileWriter = new FileWriter("c:\\Users\\Dell\\Desktop\\test.txt");
            String line = sc.nextLine();
            fileWriter.write(line);
            sc.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package chapter16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
/*
예제 16-3 : URLConnection으로 원격지에서  데이터 읽기
 */
public class URLConnectionReader {
    public static void main(String[] args) {
        URL myGithub = null;

        try {
            myGithub = new URL("https://github.com/ruthetum");
            URLConnection conn = myGithub.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String html;
            while ((html = bufferedReader.readLine()) != null) {
                System.out.println(html);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package chapter16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/*
예제 16-2 : URL 주소에서 데이터 읽기
 */
public class ReadURL {
    public static void main(String[] args) {
        URL myGithub = null;

        try {
            myGithub = new URL("https://github.com/ruthetum");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(myGithub.openStream()));

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

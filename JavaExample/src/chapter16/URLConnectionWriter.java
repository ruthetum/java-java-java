package chapter16;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/*
예제 16-4 : URLConnection을 이용하여 웹 서버에 데이터 보내기
 */
public class URLConnectionWriter {
    private static String myGithub = "http://ruthetum.cafe24.com/board/login.php";

    public static void main(String[] args) {
        try {
            URL url = new URL(myGithub);
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(conn.getOutputStream());
            outputStreamWriter.write("name=hd");
            outputStreamWriter.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

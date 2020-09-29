package chapter16;

import java.net.MalformedURLException;
import java.net.URL;

/*
예제 16-1 : URL 파싱하기

URL 클래스를 이용하여 URL을 구성하는 프로토콜 이름, 호스트 주소, 포트 번호 등 각 부분을 파싱해보자
 */
public class ParseURL {
    public static void main(String[] args) {
        URL myGithub = null;

        try {
            myGithub = new URL("https://github.com/ruthetum");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        System.out.println("protocol = " + myGithub.getProtocol()); // 프로토콜 출력
        System.out.println("host = " + myGithub.getHost()); // 호스트  이름 출력
        System.out.println("port = " + myGithub.getPort()); // 포트 번호 출력
        System.out.println("path = " + myGithub.getPath()); // 경로 부분 출력
        System.out.println("filename = " + myGithub.getFile()); // 파일 이름 출력
    }
}

package chapter13;
/*
예제 13-1 : Thread를 상속받아 1초 단위의 시간 출력하기
 */
public class ThreadEX {
    public static void main(String[] args) {
        TimerThread thread = new TimerThread();
        thread.start();
    }
}

class TimerThread extends Thread {
    public void run() {
        int n = 0;
        while(true) {
            n++;
            try {
                Thread.sleep(1000);
                System.out.println(n + "초");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

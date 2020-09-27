package chapter13;
/*
예제 13-2 : Runnable 인터페이스를 구현하여 1초 단위 출력하기
 */
public class RunnableEx1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new TimerRunnable());
        thread.start();
    }
}

class TimerRunnable implements Runnable {
    public void run() {
        int n=0;
        while(true) {
            n++;
            try{
                Thread.sleep(1000);
                System.out.println(n + "초");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

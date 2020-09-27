package chapter13;
/*
에제 13-4 : 다른 스레드 강제 종료
(main 스레드에서 sleep(5500) 걸어서 5초 뒤 시간 출력 종료)
 */
public class InterruptEx {
    public static void main(String[] args) {
        InterruptThred thread = new InterruptThred();
        thread.start();

        try {
            Thread.sleep(5500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }
}

class InterruptThred extends Thread {
    public void run() {
        int n=0;
        while(true) {
            n++;
            try {
                Thread.sleep(1000);
                System.out.println(n + "초");
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
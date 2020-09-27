package chapter13;
/*
예제 13-5 : flag를 이용한 스레드 강제 종료
 */
public class FlagEx {
    public static void main(String[] args) {
        FlagThread thread = new FlagThread();
        thread.start();

        try {
            Thread.sleep(5500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.finish();
    }
}

class FlagThread extends Thread {
    int n = 0;
    boolean flag = false;
    public void finish() {
        flag = true;
    }
    public void run() {
        while(true) {
            n++;
            try {
                Thread.sleep(1000);
                System.out.println(n + "초");
                if (flag == true) {
                    return;
                }
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

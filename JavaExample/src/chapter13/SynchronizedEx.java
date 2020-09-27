package chapter13;
/*
synchronized 사용 예 : 각각 10번 접근하기
 */
public class SynchronizedEx {
    public static void main(String[] args) {
        Score score = new Score();
        Thread thread1 = new StudentThread("AAA", score);
        Thread thread2 = new StudentThread("BBB", score);

        thread1.start();
        thread2.start();
    }
}

class Score {
    int value = 0;

    synchronized void add(){
        int n = value;
        Thread.yield(); // 다른 스레드에 양보
        n += 10;
        value = n;
        System.out.println("[name] / [score] : " + Thread.currentThread().getName() + " / " + value);
    }
    int getValue() {
        return value;
    }
}

class StudentThread extends Thread {
    Score score;
    public StudentThread(String name, Score score) {
        super(name);
        this.score = score;
    }
    public void run() {
        int i = 0;
        while (i<10) {
            score.add();
            i++;
        }
    }
}



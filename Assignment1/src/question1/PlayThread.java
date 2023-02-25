package question1;

public class PlayThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread--3: Playing League of Legend.");
        }
    }
}

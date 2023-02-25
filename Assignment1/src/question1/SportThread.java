package question1;

public class SportThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread--4: Playing Basketball with my friends.");
        }
    }
}

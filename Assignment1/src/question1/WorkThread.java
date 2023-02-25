package question1;

public class WorkThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread--2: I am writing project");
        }
    }
}

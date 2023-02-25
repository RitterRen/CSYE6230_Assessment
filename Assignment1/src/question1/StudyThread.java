package question1;

public class StudyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread--1: I am learning operating system");
        }
    }
}

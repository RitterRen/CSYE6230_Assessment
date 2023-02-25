package question1;

public class Question1 {
    /**
     * Write code in any language which will create 4 threads and run them in parallel.
     */

    public static void main(String[] args) {
        WorkThread workThread = new WorkThread();
        StudyThread studyThread = new StudyThread();
        SportThread sportThread = new SportThread();
        PlayThread playThread = new PlayThread();

        new Thread(workThread).start();
        new Thread(studyThread).start();
        new Thread(sportThread).start();
        new Thread(playThread).start();
    }
}

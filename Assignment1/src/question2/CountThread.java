package question2;

public class CountThread implements Runnable{
    int start;
    int end;
    double[] arr;
    public double res;

    public CountThread(int start, int end, double[] arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
    }

    @Override
    public void run() {
        double res = 1;

        for (int i = start; i < end; i++) {
            res *= arr[i];
        }

        this.res = res;
    }

    public double getRes() {
        return this.res;
    }

}

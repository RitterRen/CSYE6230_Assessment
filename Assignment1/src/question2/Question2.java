package question2;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Question2 {
    public double[] testArr;
    static int len = 400000000;

    public Question2() {
        this.testArr = new double[len];

        for (int i = 0; i < this.testArr.length; i++) {
            testArr[i] = Math.random();
        }
    }

    public static void main(String[] args) {
        Question2 q2 = new Question2();
        //System.out.println(Arrays.toString(q2.testArr));

        // Multiply the result in single serial thread
        long startTime = System.currentTimeMillis();
        double res = 1;
        for (double num: q2.testArr) {
            res *= num;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Single Thread Running Time : " + (endTime - startTime) + "ms"
                + "  Result is :" + res);
        // Single Thread Running Time : 501ms  Result is :0.0

        // 4 Thread speed up the multiply:
        startTime = System.currentTimeMillis();
        double[] resArr = new double[4];
        for (int i = 0; i < 4; i++) {
            int start = len / (i + 1);
            int end = start + (len / 4);

            int finalI = i;
            Thread t = new Thread(() -> {
                double tempRes = 1;

                for (int k = start; k < end; k++ ) {
                    tempRes *= q2.testArr[k];
                }
                resArr[finalI] = tempRes;
            });
        }

        for (double temp: resArr) {
            res *= temp;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Multiple Thread Running Time : " + (endTime - startTime) + "ms"
                + "  Result is :" + res);

        /**
         * Single Thread Running Time : 503ms  Result is :0.0
         * Multiple Thread Running Time : 7ms  Result is :0.0
         */
    }
}

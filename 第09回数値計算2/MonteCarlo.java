package 第09回数値計算2;

import java.util.Random;

public class MonteCarlo {
    public static void main(String args[]) {
        double count = 0;
        double x, y;
        double myPI;
        int k = 1000000000;
        for (int i = 0; i < k; i++) {
            x = Math.random();
            y = Math.random();

            if (x * x + y * y < 1) {
                count++;
            }
        }
        System.out.println("プロット数=" + k);
        System.out.println("円内数=" + count);

        myPI = count * 4.0 / k;
        System.out.println("PI=" + myPI);
}

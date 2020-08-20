package 第09回数値計算2;

public class Eratosthenes {
    public static void main(String[] args) {
        int maxP = 1000;// この値までの素数を求める
        int i, p;
        int[] a;
        a = new int[maxP];

        p = 2;
        while (p * p <= maxP) {
            // ふるいの作成

            for (i = 2; p * i < maxP; i = i + 1) {
                a[p * i] = 1;
            }
            for (p = p + 1; p * p <= maxP; p = p + 1) {
                if (a[p] == 0) {
                    break;
                }
            }
        }
        for (i = 2; i < maxP; i++) {
            if (a[i] == 0) {
                System.out.print(" " + i);
            }
        }
    }
}
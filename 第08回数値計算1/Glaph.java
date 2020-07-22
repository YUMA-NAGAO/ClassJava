package 第08回数値計算1;

public class Glaph {
    public static void main(String[] args) {
        int lis[] = new int[6];

        int num = 0;
        for (int i = 0; i < 10000; i++) {
            num = (int) (Math.random() * 6 + 1);
            if (num == 1) {
                lis[0] += 1;
            } else if (num == 2) {
                lis[1] += 1;
            } else if (num == 3) {
                lis[2] += 1;
            } else if (num == 4) {
                lis[3] += 1;

            } else if (num == 5) {
                lis[4] += 1;

            } else if (num == 6) {
                lis[5] += 1;

            }

        }

        for (int i = 0; i < lis.length; i++) {
            int num1 = (int) (lis[i]);
            double res = num1 / 10000.0;
            System.out.println(i + 1 + "の目の数＝" + num1 + " , 確率=" + res);

        }

    }
}
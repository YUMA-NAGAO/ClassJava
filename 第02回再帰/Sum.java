package 第02回再帰;

public class Sum {
    public static void main(String[] args) {
        CalcSum(10);
    }

    public static int CalcSum(int n) {
        if (n > 1) {
            n = CalcSum(n - 1) + n;
            System.out.println(n);

        } else {
            System.out.println(n);

        }

        return n;
    }
}

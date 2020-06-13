package 第02回再帰;

public class Fact {
    public static void main(String[] args) {
        CalcFact(10);
    }

    public static int CalcFact(int n) {
        if (n > 1) {
            n = CalcFact(n - 1) * n;
            System.out.println(n);

        } else {
            System.out.println(n);

        }

        return n;
    }
}

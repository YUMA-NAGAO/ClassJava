package 第02回再帰;

public class hanoi {
    public static void main(String[] args) {
        hanoi(3, "A", "B", "C");
        // A≡開始棒、B≡目的棒、C≡作業棒とする
    }

    static void hanoi(int n, String start, String goal, String task) {
        if (n > 1) {
            hanoi(n - 1, start, task, goal);
            System.out.println(n + ":" + start + " - > " + goal);
            hanoi(n - 1, task, goal, start);
        } else {
            System.out.println(n + ":" + start + " - > " + goal);

        }

    }
}
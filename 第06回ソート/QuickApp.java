package 第06回ソート;

import java.util.Random;

public class QuickApp {
    public static void main(String[] args) {
        int n = 15;
        Quick app = new Quick(n);
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            app.insert(rnd.nextInt());
        }

        app.display(0, n);

        app.quickSort(0, n - 1);
        System.out.println("--------");
        app.display(0, n - 1);
    }
}